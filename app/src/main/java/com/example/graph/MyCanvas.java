package com.example.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MyCanvas extends View {

    Paint paintBrush;
    ArrayList<Monitor> lista;

    public MyCanvas(Context context) {
        super(context);
        paintBrush = new Paint();
    }

    public void setDataSource(ArrayList<Monitor> lista){
        this.lista = lista;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paintBrush.setColor(Color.BLACK); // set color
        paintBrush.setStrokeWidth(3); // set stroke

        //canvas.drawRect(0,canvas.getHeight(), (float) canvas.getWidth()/2, (float) canvas.getHeight()/2, paintBrush);
        ArrayList<DataForGraph> toateDiagonalele = new ArrayList<>();

        // Am creat clasa DataForGraph, care retine numarul monitoare cu aceeasi diagonala, ex: 3 monitoare de 15''
        // For-ul de mai jos traduce lista de monitoare intr-o lista de DataForGraph

        for(Monitor m : lista){
            int numberOfApereances = 0;
            for(Monitor mm : lista){
                if(mm.getDiagonala() == m.getDiagonala()){
                    numberOfApereances++;
                }
            }
            DataForGraph data = new DataForGraph(Float.toString(m.getDiagonala()), numberOfApereances);
            if(!toateDiagonalele.contains(data)){
                toateDiagonalele.add(data);
            }
        }

        //Ca coloanele(cacofonie intentionata, ma doare creierul si nu am mai cautat alta exprimare) sa fie la distante egale
        //imparti latimea canvasului la cate inregistrari ai de pus in graph

        int lengthUnit = canvas.getWidth()/toateDiagonalele.size();

        //Seteaza size-ul fontului pentru label-urile ce iti arata diagonala
        paintBrush.setTextSize(50);

        //Ca sa faci coloanele de culori diferite
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        //Aici se incepe desenarea graph-ului prin parcurgerea listei de obiecte DataForGraph
        for(int i = 0; i<toateDiagonalele.size(); i++){
            paintBrush.setColor(color);

            //Aici desenezi diagonalele : primul parametru e textul pe care il pui, apoi coordonata x este ega
            canvas.drawText(toateDiagonalele.get(i).getDiagonala() +"''", i * lengthUnit, canvas.getHeight()-50, paintBrush);

            int left = lengthUnit * i;
            int right = left + 100;
            int top = canvas.getHeight() - 100;
            int bottom = canvas.getHeight() - toateDiagonalele.get(i).getNrDeDiagonale()*400;
            canvas.drawRect(left, top, right, bottom, paintBrush);
            canvas.drawText(Integer.toString(toateDiagonalele.get(i).getNrDeDiagonale()), i*lengthUnit, bottom-20, paintBrush);

            color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        }
    }
}

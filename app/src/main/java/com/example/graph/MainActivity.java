package com.example.graph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyCanvas myCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas = new MyCanvas(this);
        myCanvas.setBackgroundColor(Color.WHITE);

        ArrayList<Monitor> lista = new ArrayList<>();

        Monitor m1 = new Monitor(12, "Dell");
        Monitor m2 = new Monitor(12, "Samsung");
        Monitor m3 = new Monitor(15, "Lenovo");
        Monitor m4 = new Monitor(17, "IDontKnow");
        Monitor m5 = new Monitor(17, "IDontKnow");
        Monitor m6 = new Monitor(20, "IDontKnow");
        Monitor m7 = new Monitor(20, "IDontKnow");
        Monitor m8 = new Monitor(20, "IDontKnow");

        lista.add(m1);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        lista.add(m5);
        lista.add(m6);
        lista.add(m7);
        lista.add(m8);

        myCanvas.setDataSource(lista);

        setContentView(myCanvas);
    }
}

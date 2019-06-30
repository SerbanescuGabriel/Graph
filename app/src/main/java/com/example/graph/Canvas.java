package com.example.graph;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends View {

    List<Monitor> list;

    public Canvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    public void SetList(ArrayList<Monitor> list){
        this.list = list;
    }
}

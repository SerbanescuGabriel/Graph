package com.example.graph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Canvas canvas = new Canvas(this);
        canvas.SetList(new ArrayList<Monitor>());

        setContentView(canvas);
    }
}

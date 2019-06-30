package com.example.graph;

public class Monitor {
    float diagonala;
    String denumire;

    public Monitor(float diagonala, String denumire) {
        this.diagonala = diagonala;
        this.denumire = denumire;
    }

    public float getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(float diagonala) {
        this.diagonala = diagonala;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}

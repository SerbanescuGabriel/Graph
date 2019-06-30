package com.example.graph;

import androidx.annotation.Nullable;

public class DataForGraph {
    private String diagonala;
    private int nrDeDiagonale;

    public DataForGraph(String diagonala, int nrDeDiagonale) {
        this.diagonala = diagonala;
        this.nrDeDiagonale = nrDeDiagonale;
    }

    public String getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(String diagonala) {
        this.diagonala = diagonala;
    }

    public int getNrDeDiagonale() {
        return nrDeDiagonale;
    }

    public void setNrDeDiagonale(int nrDeDiagonale) {
        this.nrDeDiagonale = nrDeDiagonale;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        DataForGraph toCompare = (DataForGraph)obj;
        return this.getDiagonala().equals(toCompare.getDiagonala());
    }
}

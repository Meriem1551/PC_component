package com.pc;

public class Type {
    protected int id;
    protected String modele;

    public Type(int id, String modele) {
        this.id = id;
        this.modele = modele;
    }

    public double CalculerPuissance() {
        return 0.0;
    }

}
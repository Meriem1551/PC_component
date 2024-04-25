package com.pc;

public class MN extends Type {
    protected int class_cons;
    protected int dim;
    protected int resol_max;

    public MN(int id, String modele, int class_cons, int dim, int resol_max) {
        super(id, modele);
        this.class_cons = class_cons;
        this.dim = dim;
        this.resol_max = resol_max;
    }

    @Override
    public double CalculerPuissance() {
        return (this.class_cons * this.dim + this.resol_max * 0.015);
    }
}
package com.pc;

public class KB extends Type {

    protected int NBTouches;
    protected String KBpuiss;

    public KB(int id, String modele, int NBTouches, String KBpuiss) {
        super(id, modele);
        this.NBTouches = NBTouches;
        this.KBpuiss = KBpuiss;
    }

    @Override
    public double CalculerPuissance() {
        return Double.parseDouble(KBpuiss.substring(0, 1));
    }
}
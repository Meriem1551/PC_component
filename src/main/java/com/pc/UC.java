package com.pc;

public class UC {
    protected double CPU;
    protected double RAM;
    protected String UCpuiss;

    public UC(double CPU, double RAM, String UCpuiss) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.UCpuiss = UCpuiss;
    }

    public double getUCPuiss() {
        return Double.parseDouble(UCpuiss.substring(0, 1));
    }
}
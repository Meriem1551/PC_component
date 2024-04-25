package com.pc;

public class PRQ {
    public Type[] peripheriques;
    protected int max_size;
    static int index = 0;

    public PRQ(int max_size) {
        this.max_size = max_size;
        this.peripheriques = new Type[this.max_size];
    }

    public void addPer(Type per) {
        if (per != null) {
            if (index < this.max_size) {
                peripheriques[index] = per;
                index++;
            } else {
                System.out.println("Array is full\n");
            }
        } else {
            System.out.println("Can't add this object, it is Null !\n");
        }
    }

    public double puissance_total_per() {
        double res = 0;
        for (int i = 0; i < max_size; i++) {
            res += peripheriques[i].CalculerPuissance();
        }
        return res;
    }
}
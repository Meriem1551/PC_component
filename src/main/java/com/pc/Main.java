package com.pc;

public class Main {
    public static void main(String[] args) {
        try {
            UC unite_centrale = new UC(256, 16, "10W");
            MN monitor = new MN(11345, "Dell U2719D", 2, 18, 1700);
            KB keyboard = new KB(234654, "Logitech K780", 102, "5W");
            PRQ perph = new PRQ(2);
            perph.addPer(monitor);
            perph.addPer(keyboard);

            PC pc0 = new PC(unite_centrale, perph);
            double power_con = pc0.calConsoElec(5);
            System.out.println("power consumption of this pc is: " + power_con + " Watts");
        } catch (ConsoException CE) {
            System.out.println(CE.getMessage());
        }
    }
}
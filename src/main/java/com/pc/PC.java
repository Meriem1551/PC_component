package com.pc;

public class PC {
    UC unite_centrale;
    PRQ p;

    public PC(UC uc, PRQ prq) {
        this.unite_centrale = uc;
        this.p = prq;
    }

    public double calConsoElec(int nbhours) throws ConsoException {
        double puiss_total_pc, consumption;
        puiss_total_pc = unite_centrale.getUCPuiss() + p.puissance_total_per();
        consumption = puiss_total_pc * nbhours;
        if (consumption > 1000) {
            throw new ConsoException("Warning: High power consumption detected!! it is greater than 1000 watts");
        } else {
            return consumption;
        }
    }
}
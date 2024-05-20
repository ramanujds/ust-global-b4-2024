package com.ust.app;

public class Phone {

    Sim sim;

    public void insertSim(Sim sim) {
        this.sim = sim;
    }

    public void browseInternet(){
        sim.browseInternet();
    }


}

package com.ust.app;

public class AirFiber {

    AirtelSim sim;

    public void insertSim(AirtelSim sim) {
        this.sim = sim;
    }

    public void browseInternet(){
        sim.browseInternet();
    }


}

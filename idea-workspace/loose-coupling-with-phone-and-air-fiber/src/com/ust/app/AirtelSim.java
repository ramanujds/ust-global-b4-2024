package com.ust.app;

public class AirtelSim implements Sim {

    public void browseInternet(){
        System.out.println("Browsing internet with "+this.getClass().getSimpleName());
    }

}

package com.ust.app;

public class InternetBrowser {

    public static void main(String[] args) {
        AirtelSim sim1 = new AirtelSim();
        JioSim sim2 = new JioSim();
        AirFiber airFiber = new AirFiber();
        airFiber.insertSim(sim1);

        airFiber.browseInternet();

        Phone iPhone = new Phone();
        iPhone.insertSim(sim2);
        iPhone.browseInternet();

    }

}

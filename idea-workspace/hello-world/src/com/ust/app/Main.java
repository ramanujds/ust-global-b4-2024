package com.ust.app;

import com.ust.app.model.HpBasicPrinter;
import com.ust.app.model.HpPrinter;
import com.ust.app.model.Trainee;

public class Main {
    public static void main(String[] args) {

        HpPrinter avdPrinter = new HpPrinter();
        avdPrinter.print();
        avdPrinter.scan();

        HpBasicPrinter basicPrinter = new HpBasicPrinter();

        basicPrinter.print();



    }
}
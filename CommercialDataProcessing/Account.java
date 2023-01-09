package com.bridgelabz.Day11_12.CommercialDataProcessing;

import java.io.IOException;

public interface Account {

    double valueOf();

    void buy(int amount,String symbol);

    void sell(int amount,String symbol);

    void save(String filename) throws IOException;

    void printReport();
}

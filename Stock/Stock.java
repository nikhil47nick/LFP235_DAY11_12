package com.bridgelabz.Day11_12.Stock;

public class Stock {

    private String name;
    private double sharePrice;
    private int numberOfShares;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return sharePrice;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public Stock(String name, double sharePrice, int numberOfShares) {
        super();
        this.name = name;
        this.sharePrice = sharePrice;
        this.numberOfShares = numberOfShares;
    }



}

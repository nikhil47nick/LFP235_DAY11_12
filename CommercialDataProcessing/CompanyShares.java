package com.bridgelabz.Day11_12.CommercialDataProcessing;

import java.util.Date;

public class CompanyShares {

    private String stockSymbol;

    private int amount;
    private double numberOfShare;
    private Date date;

    CompanyShares(String stockSymbol,int amount,double numberOfShare,Date date){
        this.stockSymbol = stockSymbol;
        this.amount = amount;
        this.numberOfShare = numberOfShare;
        this.date = date;
    }

    String getStockSymbol(){
        return stockSymbol;
    }
    double getNumberOfShare(){
        return numberOfShare;
    }
    Date getDate(){
        return date;
    }
    int getAmount(){
        return amount;
    }

    void setStockSymbol(String data){
        this.stockSymbol = data;
    }
    void setNumberOfShare(double data){
        this.numberOfShare = data;
    }
    void setDate(Date data){
        this.date = data;
    }
    void setAmount(int data){
        this.amount = data;
    }

}

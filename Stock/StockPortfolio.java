package com.bridgelabz.Day11_12.Stock;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {

        stocks = new ArrayList<Stock>();

    }

    public void StockPortfolio() throws IOException {

        File file = new File("C:\\Users\\nikhi\\IdeaProjects\\LFP_Java Fellowship - 235\\src\\com\\bridgelabz\\Day11_12\\Stock\\StockFile");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while(line != null){
            Scanner scr = new Scanner(line);
            String stockName = scr.next();
            double stockPrice = scr.nextDouble();
            int numberShares = scr.nextInt();
            stocks.add(new Stock(stockName, stockPrice, numberShares));
            line = br.readLine();
        }

    }

    public void displayStock(){
        double total=0;
        System.out.println("Total Stocks are");
        for (int i = 0; i < stocks.size(); i++) {


            System.out.println("Stock Name: "+stocks.get(i).getName());
            System.out.println("Number of Stocks: "+stocks.get(i).getNumberOfShares());
            System.out.println("Share Price: "+stocks.get(i).getPrice());
            System.out.println("Total value of stock: "+totalValueOfStock(i));
            total = total+totalValueOfStock(i);
            System.out.println("");
        }

        System.out.println("Total Stock value: "+total);
    }

    double totalValueOfStock(int i){
        return stocks.get(i).getNumberOfShares() * stocks.get(i).getPrice();
    }

}

package com.bridgelabz.Day11_12.CommercialDataProcessing;

import com.bridgelabz.Day11_12.Stock.Stock;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StockAccount implements Account {

    ArrayList<CompanyShares> stock;
    Date date = new Date();;

    StockAccount(String filename) throws IOException {

        //create new account from file
        stock = new ArrayList<CompanyShares>();
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        while(line != null){
            Scanner scr = new Scanner(line);
            String symbol = scr.next();
            int amount = scr.nextInt();
            double numberShares = scr.nextDouble();
            stock.add(new CompanyShares(symbol,amount, numberShares,date));
            line = br.readLine();
        }


    }

   public double valueOf(){
        //total value of account in dollars
       double total=0;
       for (int i=0;i<stock.size();i++){
           total = total + (stock.get(i).getAmount() * stock.get(i).getNumberOfShare());
       }
        return total;
    }

    public void buy(int amount,String symbol){
        //add shared of stock to account
        for (int i=0;i<stock.size();i++){
            CompanyShares cs = stock.get(i);
            if(cs.getStockSymbol() == symbol){
                cs.setNumberOfShare(cs.getNumberOfShare() + (amount/cs.getAmount()));
                cs.setDate(date);
                stock.set(i,cs);
                return;
            }
        }

        stock.add(new CompanyShares(symbol,amount, 1,date));

        }

    public  void sell(int amount,String symbol){
        //subtract share of stock from account

        for (int i=0;i<stock.size();i++){
            CompanyShares cs = stock.get(i);
            if(cs.getStockSymbol() == symbol){
                cs.setNumberOfShare(cs.getNumberOfShare() - (amount/cs.getAmount()));
                cs.setDate(date);
                if(cs.getNumberOfShare()>0){
                    stock.set(i,cs);
                }else if (cs.getNumberOfShare()<0){
                    System.out.println("Insufficient amount to sell");
                }
                return;
            }
        }
        System.out.println("No share available");
        }

    public void save(String filename) throws IOException {
        //save account to file

                FileWriter fw = new FileWriter(filename, false);
                PrintWriter pw = new PrintWriter(fw, false);
                pw.flush();
                for (int i=0;i<stock.size();i++){
                      CompanyShares cs = stock.get(i);
                      String data = cs.getStockSymbol() + " "+cs.getAmount()+ " " + cs.getNumberOfShare() + " "+cs.getDate();
                      pw.println(data);
                 }
                pw.close();
                fw.close();
        }

    public void printReport(){
        //print detailed report of stocks and values

        for (int i=0;i<stock.size();i++){
            CompanyShares cs = stock.get(i);
            System.out.println("Symbol : "+cs.getStockSymbol());
            System.out.println("Amount : "+cs.getAmount());
            System.out.println("Number of shares : "+cs.getNumberOfShare());
            System.out.println("Total stock value is : "+ (cs.getAmount()*cs.getNumberOfShare()) );
            System.out.println("");
        }
        System.out.println("Total value is : "+valueOf());

        }


    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\nikhi\\IdeaProjects\\LFP_Java Fellowship - 235\\src\\com\\bridgelabz\\Day11_12\\CommercialDataProcessing\\Portfolio";
        StockAccount acc = new StockAccount(filename);
        acc.printReport();
        acc.save(filename);

    }

}

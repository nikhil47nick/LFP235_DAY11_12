package com.bridgelabz.Day11_12.Cards;


import javax.swing.plaf.IconUIResource;
import java.util.Random;

public class DeckOfCards {
   String[][] cards;
   String deck[]= new String[52];

    DeckOfCards(){
        cards =new String[][] {{"Clubs", "Diamonds", "Hearts", "Spades"},{"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"}};

    }
    public void shuffle(){
        int index;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                 do{
                     Random ran = new Random();
                    index  = ran.nextInt(52);
                }while(deck[index] != null);
                deck[index] =  cards[1][j] + cards[0][i];
            }
        }
    }

public void display(String[] player){
    for(int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
}


    public String[] playerCard() {

        int index;
        String [] player = new String[9];
        for(int i = 0; i < 9; i++) {

            do{
                Random ran = new Random();
                index  = ran.nextInt(52);
            }while(deck[index] == null);
            player[i] = deck[index];
            deck[index]=null;
        }
        return player;
    }
}


package com.bridgelabz.Day11_12.Cards;

public class Main {




    public static void main(String[] args) {
        String[] player1= new String[9];
        String[] player2= new String[9];
        String[] player3= new String[9];
        String[] player4= new String[9];

        DeckOfCards cd = new DeckOfCards();
        cd.shuffle();
        cd.display(cd.deck);
        player1 = cd.playerCard();
        player2 = cd.playerCard();
        player3 = cd.playerCard();
        player4 = cd.playerCard();
        System.out.println("Player 1 cards");cd.display(player1);
        System.out.println("Player 2 cards");cd.display(player2);
        System.out.println("Player 3 cards");cd.display(player3);
        System.out.println("Player 4 cards");cd.display(player4);

    }



}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String gmail;
    String password;
    int numberOfCard;
    List<Card> userCards=new ArrayList<>();
    Game currentGame;
    int totalBall;

    public User(String sdklm) {
    }

    public void inviteUser(int currentGame){

    };
    public boolean joinGame(String sicretWord){return true;}

    public boolean madeStep(int numberCard){return true;}

    public void viewMyCards(){}
    public  boolean getCardFromDeck(){return true;}
    public Game  startGame(){return null;}

    public void choiceCard(int indexCard) {
    }

    public void setTotalBall(int i) {
    }
}

package com.company;

import java.util.*;

public class Game {
    List<Card> dackOfCards=new ArrayList<>();
    Map <User,Card> cardsOnTable=new HashMap<>();
    Map<User,Card>choiceOfCard=new HashMap<>();
    List<User>users=new ArrayList<>();
    StateGame stateGame;
    static Map<Game,Integer> invites=new HashMap<>();
    public void viewCard(){}

    public void razdachaCart( ){
        Random random=new Random();
        for(int i=0;i<6;i++){
            for(User  tempUser:users){
                int getCard=random.nextInt((dackOfCards.size())-1);
                tempUser.userCards.add(dackOfCards.get(getCard));
                dackOfCards.remove(getCard);
            }
        }
    }
    public List<Card> createDackOfCard(){return null;}

public User whoIsDoStep(){return null;}


}
enum  StateGame{
    BEGIN,STARTED, ITERATED,FINISHED
}

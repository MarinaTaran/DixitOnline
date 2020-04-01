package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User owner=new User("sdklm");
        Game game =owner.startGame();
        User user1=new User("kdn");
        User user2=new User("fhbsdh");
        owner.inviteUser(2);
        user1.joinGame("dkdkfjgkfk");
        user2.joinGame("dkdkfjgkfk");
        game.razdachaCart();
        user1.viewMyCards();
        user2.viewMyCards();
        while (game.stateGame!=StateGame.FINISHED){
            while (game.stateGame==StateGame.ITERATED){
                User currentUser=game.whoIsDoStep();
                currentUser.madeStep(2);
        }
        game.viewCard();
            for (User temp:game.users){
                temp.choiceCard(1);
            }
            for (User temp:game.users){
                temp.setTotalBall(2);
            }

    }


}}

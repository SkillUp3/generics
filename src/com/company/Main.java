package com.company;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer ian = new FootballPlayer("ian");
        BaseballPlayer rap = new BaseballPlayer("rap");
        SoccerPlayer ej = new SoccerPlayer("ej");

//        Team philippines = new Team("Philippines");
//        philippines.addPlayer(ian);
//        philippines.addPlayer(rap);
//        philippines.addPlayer(ej);


        Team<FootballPlayer> philippinesFootball = new Team<>(" Football");
        philippinesFootball.addPlayer(ian);

        Team<BaseballPlayer> philippinesBaseball = new Team<>("Baseball");
        philippinesBaseball.addPlayer(rap);

        Team<SoccerPlayer> philipinesSoccer = new Team<>("Soccer");
        philipinesSoccer.addPlayer(ej);

        philippinesFootball.matchResults(philipinesSoccer, 1,0);
        philippinesFootball.matchResults(philippinesBaseball, 2,5);
        System.out.println("Won " + philippinesFootball.getWon());
        System.out.println("Lost " + philippinesFootball.getLost());


//        Team philippines = new Team("Team Manila");
//        philippines.addPlayer(ian);
//        philippines.addPlayer(rap);
//        philippines.addPlayer(ej);

//        System.out.println(philippines.numPlayers());

    }
}

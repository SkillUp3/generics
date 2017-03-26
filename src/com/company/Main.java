package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        BaseballPlayer ian = new BaseballPlayer("ian");
        FootballPlayer rap = new FootballPlayer("Rap");
        SoccerPlayer ej = new SoccerPlayer("ek");
        Team manila = new Team("manila");
        manila.addPlayer(ian);
        manila.addPlayer(rap);
        manila.addPlayer(ej);


        League<Team<FootballPlayer>> NFL= new League<>("NFL");
        Team<FootballPlayer> philippinesFootball = new Team<>(" philippinesFootball");
        Team<FootballPlayer> americanFootball = new Team<>(" americanFootball");
        Team<FootballPlayer> japanFootball = new Team<>(" japanFootball");
        Team<FootballPlayer> brazilFootball = new Team<>(" brazilFootball");

        NFL.add(philippinesFootball);
        NFL.add(americanFootball);
        NFL.add(japanFootball);
        NFL.add(brazilFootball);

        philippinesFootball.matchResults(americanFootball, 10, 5);
        philippinesFootball.matchResults(japanFootball, 10, 5);
        philippinesFootball.matchResults(brazilFootball, 10,5);
        americanFootball.matchResults(brazilFootball, 10, 5);
        americanFootball.matchResults(japanFootball, 10, 5);
        brazilFootball.matchResults(japanFootball, 10, 5);

        NFL.showLeagueTable();

//        philippinesFootball.addPlayer(ian);


//        philippinesBaseball.addPlayer(rap);
//
//        Team<SoccerPlayer> philipinesSoccer = new Team<>("Soccer");
//        philipinesSoccer.addPlayer(ej);

//        Team<String> thisiswerid = new Team("weird");
//        thisiswerid.addPlayer("eskaka");

//        philippinesFootball.matchResults(philipinesSoccer, 1,0);
//        philippinesFootball.matchResults(philippinesBaseball, 2,5);
//        System.out.println("Won " + philippinesFootball.getWon());
//        System.out.println("Lost " + philippinesFootball.getLost());


        Team<SoccerPlayer> japanSoccer = new Team("japan baseball");




    }


}

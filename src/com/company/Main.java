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

        Team<FootballPlayer> manilaFootball = new Team("manila football");
        manilaFootball.addPlayer(rap);
//        manilaFootball.addPlayer(ian);

        Team<BaseballPlayer> manilaBaseball = new Team ("manila baseball");
        manilaBaseball.addPlayer(ian);

        Team<BaseballPlayer> japanBaseball = new Team("japan baseball");
        Team<BaseballPlayer> koreaBaseball = new Team("korea baseball");
        Team<BaseballPlayer> usBaseball = new Team("us baseball");

        Team<SoccerPlayer> manilaSoccer = new Team("manila Soccer");
        manilaSoccer.addPlayer(ej);

        Team<SoccerPlayer> japanSoccer = new Team("japan baseball");

        manilaBaseball.matchResult(japanBaseball, 3,0);
        manilaBaseball.matchResult(usBaseball, 5, 2);
        koreaBaseball.matchResult(usBaseball, 1,5);
        japanBaseball.matchResult(koreaBaseball, 5,4);


    }

}

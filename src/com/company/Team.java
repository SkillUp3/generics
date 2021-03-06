package com.company;

import java.util.ArrayList;

/**
 * Created by ian on 20/03/2017.
 */

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String mName;
    int mPlayed = 0;
    int mWon = 0;


    int mLost = 0;
    int mTied = 0;


    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {

            System.out.println(player.getName() + " is already in the team");

            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + mName);
            return true;
        }
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            mWon++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            mTied++;
            message = " drew with ";

        } else {
            mLost++;
            message = " lost to ";
        }
        mPlayed++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int numPlayers() {
        return members.size();
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int ranking() {
        return mWon * 2 + mTied;
    }

}


//display the ranking
//criteria 1 : comparison should be acrosss the same kind teams e.g soccerteam manila, soccerteam japan,
//criteria 2: display the ranking in descending order i.e. top 1 stays on top of the list



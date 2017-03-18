package com.company;

import java.util.ArrayList;

/**
 * Created by idejesus on 18/03/2017.
 */
public class Team<T extends Player>{
        private String mName;
        int mPlayed =0;
        int mWon=0 ;

    public int getPlayed() {
        return mPlayed;
    }

    public void setPlayed(int played) {
        mPlayed = played;
    }

    public int getWon() {
        return mWon;
    }

    public void setWon(int won) {
        mWon = won;
    }

    public int getLost() {
        return mLost;
    }

    public void setLost(int lost) {
        mLost = lost;
    }

    public int getTied() {
        return mTied;
    }

    public void setTied(int tied) {
        mTied = tied;
    }

    int mLost=0;
        int mTied=0;

        private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public  boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already in the team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + mName);
            return true;
        }
    }
    public  int numPlayers(){
        return  members.size();
    }

    public void matchResults(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            mWon++;
        }else if(ourScore == theirScore){
            mTied++;
        }else{
            mLost++;
        }
        mPlayed++;

        if(opponent!=null){
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return mWon *2 + mTied;
    }
}

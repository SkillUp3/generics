package com.company;

/**
 * Created by idejesus on 18/03/2017.
 */
public abstract class Player {
    private String mName;


    public Player(String name) {

        mName = name;
    }

    public String getName() {
        return mName;
    }
}

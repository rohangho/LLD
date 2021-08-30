package com.company.game;

import com.company.players.Players;

import java.util.List;

// this class will be a singleton
public class GameFactory {

    public static GameFactory INSTANCE;

    private GameFactory() {

    }

    public static GameFactory getInstance() {
        if (INSTANCE == null) {
            synchronized ((GameFactory.class)) {
                if (INSTANCE == null)
                    INSTANCE = new GameFactory();
            }
        }
        return INSTANCE;
    }


    public Game createSnakeAndLadder(List<Players> listOfPlayers) {

    }

}

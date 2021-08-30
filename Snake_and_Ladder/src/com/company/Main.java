package com.company;

import com.company.game.*;
import com.company.players.ComputerPlayer;
import com.company.players.Players;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Players> players = new ArrayList();
        players.add(new HumanPlayers("ram", "red"));
        players.add(new HumanPlayers("zadu", "green"));
        players.add(new ComputerPlayer("bot1", "blue", new SnakeLadderStrategy()));
        Game game = GameFactory.getInstance().createSnakeAndLadder(players);
        GameController controller = new GameController(game);
        controller.startGame();
    }
}

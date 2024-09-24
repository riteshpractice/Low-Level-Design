package SnakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    Dice dice;
    Board board;
    Queue<Player> players = new LinkedList<>();
    Player winner;

    Game(int size, int count, int snake , int ladder){
        dice = new Dice(count);
        board = new Board(size,snake,ladder);
        addPlayers();
        winner=null;
    }

    public void addPlayers(){
        Player player1= new Player("player1");
        Player player2 = new Player("player2");
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){

        while(winner==null){
            Player playerturn = players.poll();
            players.add(playerturn);

            playerturn.move(dice,board);
            if (playerturn.getPos()>= board.size*board.size-1){
                winner=playerturn;
                System.out.println(playerturn.name+"" +"won the game");
            }
        }
    }

}

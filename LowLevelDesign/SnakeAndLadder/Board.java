package SnakeAndLadder;

import java.util.Random;

public class Board {

    int size;
    Cell[] cells;

    Board(int size, int snake , int ladder){
        this.size=size;
        intilaize(size);
        addSnakeAndLadder(snake, ladder);
    }

    public void intilaize(int size){

        int totalCell=size*size;
        cells= new Cell[totalCell];
        for (int i=0;i<totalCell;i++){
            cells[i]= new Cell();
        }
    }

    public void addSnakeAndLadder(int snake , int ladder){

        while(snake>0){
            int head=new Random().nextInt(1,100);
            int tail= new Random().nextInt(1,100);

             if (head < tail){
                 continue;
             }else{
                 Jump jump = new Jump(head, tail);
                 cells[head].setJump(jump);
             }
             snake--;
        }
        while(ladder>0){
            int up=new Random().nextInt(1,100);
            int down= new Random().nextInt(1,100);

            if (up < down){
                continue;
            }else{
                Jump jump = new Jump(down,up);
                cells[down].jump=jump;
            }
            ladder--;
        }
    }
}

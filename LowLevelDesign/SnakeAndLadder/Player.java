package SnakeAndLadder;

public class Player {

    int pos;
    String name;

    public Player(String name) {
        this.name = name;
        this.pos=0;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void move(Dice dice, Board board){

        System.out.println(name+" is at postion"+pos);
        int roll= dice.rollDice();
        int newpos= pos+roll;
        System.out.println(name+" is at postion"+newpos);

        if (newpos>board.size*board.size-1){
            newpos=pos;
        }else{
            Cell cell= board.cells[newpos];
            if (cell.jump!=null){
                String type= cell.jump.start<cell.jump.end ? "ladder":"Snake";
                System.out.println(type);
                newpos= cell.jump.end;
                System.out.println(name+" is at postion"+newpos);
            }
        }
        pos=newpos;
    }
}

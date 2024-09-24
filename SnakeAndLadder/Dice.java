import java.util.Random;

public class Dice {

    int count;

    public Dice(int count) {
        this.count = count;
    }

    public int rollDice(){
        int result=0;
        for (int i=0;i<count;i++){
            result+=new Random().nextInt(1,7);
        }
        return result;
    }
}

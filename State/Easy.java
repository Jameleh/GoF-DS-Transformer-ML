/**
 * @author Caroline Stokes
 */
import java.util.Random;

public class Easy implements State {

    private ArithmeticGame game;
    private Random random = new Random();

    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int num = random.nextInt(10);
        return num;
    }
    public String getOperation() {
        int num = random.nextInt(10);
        if(num%2 == 0) { //finding random number from 0 to 9 either even or odd
            return "+";
        }
        else {
            return "-";
        }
    }
    public void levelUp() {
        game.setState(new Medium(game));
        System.out.println("You have been advanced to medium mode");


    }
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study");
    }
    
}

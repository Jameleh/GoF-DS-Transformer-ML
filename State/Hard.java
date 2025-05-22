/**
 * @author Caroline Stokes
 */
import java.util.Random;

public class Hard implements State {
   
    private ArithmeticGame game;
    private Random random = new Random();

    public Hard(ArithmeticGame game) {
        this.game = game;
    }
    public int getNum() {
        int num = random.nextInt(100);
        return num;
    }
    public String getOperation() {
        int num = random.nextInt(100);
        if(num%4 == 0) {
            return "+";
        }
        else if (num%4 == 1) {
            return "-";
        }
        else if(num%4 == 2) {
            return "*";
        }
        else {
            return "/";
        }
    }
    public void levelUp() {
        System.out.println("You are doing so well!");
    }
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are studdling, let's go to medium mode.");
    }
}



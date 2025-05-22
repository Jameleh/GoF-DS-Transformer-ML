/**
 * @author Caroline Stokes
 */
import java.util.Random;
public class Medium implements State{
    private ArithmeticGame game;
    private Random random = new Random();

    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int num = random.nextInt(50);
        return num;
    }
    public String getOperation() {
        int num = random.nextInt(48); { 
            if(num%3 == 0) {
                return "+";
            }
            else if(num%3 == 1) {
                return "-";
            }
            else {
                return "*";
            }
        }
    }
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You have been advanced to the hardest mode.");
    }
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are stuggling, lets got to easy mode.");
    }
    /**
     * getNum(): Returns a number between 1 and 50
        getOperation(): Randomly returns either "+", "-", or "*"
        levelUp(): Advances the game to Hard State, and displays "You've been advanced to the hardest mode."
        levelDown(): Switches the state to EasyState, and Displays "You are struggling, let's go to easy mode."

     */
    
    
}

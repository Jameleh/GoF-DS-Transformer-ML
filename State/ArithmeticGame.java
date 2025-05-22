/**
 * @author Caroline Stokes
 */
import java.util.Scanner;

public class ArithmeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    int score;
    private Scanner reader;
    public static void main(String[] args) {
        ArithmeticGame game= new ArithmeticGame();
        System.out.println("Welcome to our Arithemetic Game");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Answer a Question");
            System.out.println("2. Quit");
            int option = sc.nextInt();
            if(option == 1) {
                game.pressQuestionButton();
            }
            else if (option == 2) {
                break;
            }
        }
        while(true); 
        sc.close();
    }

    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        reader = new Scanner(System.in);
        state = easyState; //setting it at the begginning
        
    }
    
    public void pressQuestionButton() {
        int number1 = state.getNum();
        int number2 = state.getNum();
        String operation = state.getOperation();
        System.out.print(number1 + operation + number2+ ":");
        int answer = reader.nextInt();
        boolean answerIsCorrect = false;
        if(operation.equals("+")) {
            answerIsCorrect = (number1 + number2 == answer);
        }
        else if(operation.equals("-")){
            answerIsCorrect = (number1 - number2 == answer);
        }
        else if(operation.equals("*")) {
            answerIsCorrect = (number1 * number2 == answer);
        }
        else if(operation.equals("/")) {
            answerIsCorrect = (number1 / number2 == answer);
        }
        if(answerIsCorrect) {
            System.out.println("Correct");
            score ++;
        }
        else {
            System.out.println("Incorrect");
            score --;
        }
        if(score >= 3) {
            state.levelUp();
            score = 0;
        }
        if(score <= -3) {
            state.levelDown();
            score = 0;
        }
    }
   
    public void setState(State state) {
        this.state = state;
    }
    public State getEasyState() {
        return easyState;
    }
    public State getMediumState() {
        return mediumState;
    }
    public State getHardState() {
        return hardState;
    }

}


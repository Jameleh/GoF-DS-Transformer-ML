import com.ljp.colleagues.Button;
import com.ljp.colleagues.Fan;
import com.ljp.mediators.FanMediator;

public class MediatorDemoMain {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();

        createMediator(button, fan);

        button.press(); // Ray presses once
        button.press(); // Ray presses again

    }

    private static FanMediator createMediator(Button button, Fan fan) {
        return new FanMediator(button, fan);
    }
}
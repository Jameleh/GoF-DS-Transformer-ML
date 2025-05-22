package com.ljp.main;

import com.ljp.colleagues.AC;
import com.ljp.colleagues.Fan;
import com.ljp.colleagues.Light;
import com.ljp.colleagues.SmartButton;
import com.ljp.mediators.Mediator;
import com.ljp.mediators.SmartMediator;

import java.util.List;

public class MediatorDemoMain {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();
        AC ac = new AC();

        SmartButton smartSwitch = new SmartButton();
        SmartMediator controller = new SmartMediator(List.of(fan, light, ac));
        smartSwitch.setMediator(controller);

        smartSwitch.press(); // Turn all ON
        smartSwitch.press(); // Turn all OFF

        // just perform with fan and light
        System.out.print("####################################");
        SmartButton smartSwitch2 = new SmartButton();
        SmartMediator controller2 = new SmartMediator(List.of(fan, light));
        smartSwitch2.setMediator(controller2);
        smartSwitch2.press(); // Turn all ON
        smartSwitch2.press(); // Turn all OFF

    }
}
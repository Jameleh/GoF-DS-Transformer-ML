/**
 * Robot class 
 * @author Overachievers
 */
public class Robot {
    /**
     * Constructor for Robot Class
     * @param name String for the name of the robot
     */
    Robot(String name){
        System.out.println("Welcome, my name is " + name + ", I'm a friendly robot!");
    }

    /**
     * Pickup command for the robot to perform
     */
    public void pickup(){
        System.out.println("Oh treasure, picking it up!");
    }

    /**
     * Jump command for the robot to perform
     */
    public void jump(){
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }

    /**
     * Fire command for the robot to perform
     */
    public void fire(){
        System.out.println("Bad guys! Fire my blow torch at them.");
    }

    /**
     * Heal command for the robot to perform
     */
    public void heal(){
        System.out.println("Thanks for healing my wounds.");
    }
}

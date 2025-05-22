import java.util.*;

public class RobotFactory {
    Map<String,Robots>cache;
    RobotFactory(){
        cache=new HashMap<String,Robots>();
    }
    public Robots createNewRobot(String name,int sizeOfRobot,String symbol){
        if(cache.containsKey(name)) return cache.get(name);
         if(name=="HUMAN"){
            Robots robot=new HumanRobot(name,sizeOfRobot,symbol);
            cache.put(name,robot);
            return robot;
         }
         else{
             Robots robot=new AnimalRobot(name,sizeOfRobot,symbol);
             cache.put(name,robot);
             return robot;
         }
    }
}

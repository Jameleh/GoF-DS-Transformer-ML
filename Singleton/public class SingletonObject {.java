public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject () {

    }


    public static SingletonObject getInstance () {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
    
    public void showMessage () {
        system.out.printl ("Single Object:" + this);
    }
}

public class Pirncipal {
    public static void main (String[] args) {
        SingletonObject object1 = SingletonObject.getInstance();
        object1.showMessage();

        SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
    }
}
package main.java.prototype;

public class Dog extends Element{

    private String name;

    public Dog() {

    }


    @Override
    public Object cloneObj() {
        try {
            Prototype obj= (Prototype) super.clone();
            Dog newObj = (Dog) obj;
            return newObj;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return null;

    }
    
}

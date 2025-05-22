public class Sheep implements Animal {

    public Sheep(){
        System.out.println("Sheep is Made");
    }

    public Animal makeCopy() { //must implement this method since implements animal
        System.out.println("Sheep is Being Made");
        Sheep sheepObject = null;
        try {
            // Calls the Animal super classes clone() Then casts the results to Sheep
            sheepObject = (Sheep) super.clone();
        }
        // error thrown if Animal didn't extend Cloneable
        catch (CloneNotSupportedException e) {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){ //allows for printing of object, not just memory address
        return "Dolly is my Hero, Baaaaa";
    }

}
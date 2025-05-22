public class TestCloning {

    public static void main(String[] args){

        // Handles routing makeCopy method calls to the right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep(); //sheep instance created

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally); // cloned of 'sally' created
        // the sequence is Sheep pointer made and set equal to the result of the CloneFactory instance 'animalMaker'
        // method call on getClone() method and passed the object to be cloned 'sally'. the getCLone method calls the
        // getCopy() method of animal class but really calls the subclass getCopy() method thanks to polymorphism. Returns
        // a sheep object but still need to caste it as a sheep object since generated through calling animal class


        System.out.println(sally);
        System.out.println(clonedSheep); // These are exact copies of each other

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep))); //but
        // different memory locations
    }

}
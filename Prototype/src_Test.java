public class Test {
    public static void main(String[] args) {
        Laptop laptop=new Laptop(8,512,"Asus");

        System.out.println(laptop.toString());

        Laptop clonelaptop1 = laptop.clone();
        System.out.println(clonelaptop1.toString());


        clonelaptop1.setRAM(6);
        System.out.println(clonelaptop1);



        System.out.println(laptop);

    }
}

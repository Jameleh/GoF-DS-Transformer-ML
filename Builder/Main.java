package designPtrns;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizza order = new Pizza.Builder("hot souce", "raw mushrooms").build();
        System.out.println(order.toString());
    }
}

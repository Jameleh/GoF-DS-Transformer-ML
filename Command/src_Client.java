public class Client {
	public static void main(String[] args) {
		Chef chef = new Chef();
        
		Order order = new Order(chef, "Massa");
		Waiter waiter = new Waiter(order);
		waiter.execute();

		order = new Order(chef, "Bolo");
		waiter = new Waiter(order);
		waiter.execute();
	}
}
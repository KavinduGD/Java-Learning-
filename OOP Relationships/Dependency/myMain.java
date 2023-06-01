package Dependency;

public class myMain {
	public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson("John Doe");
        Order order = new Order(1234, salesPerson);
        order.processOrder();
    }
}

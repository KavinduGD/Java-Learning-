package Association;

import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {
        // Creating customer object
        Customer customer = new Customer("John Doe");

        // Creating order objects
        Order order1 = new Order(1, "Order details 1");
        Order order2 = new Order(2, "Order details 2");

        // Associating orders with the customer
        customer.addOrder(order1);
        customer.addOrder(order2);

        // Accessing the customer's name
        System.out.println("Customer Name: " + customer.getName());

        // Accessing the orders of the customer
        List<Order> customerOrders = customer.getOrders();
        System.out.println("Orders of " + customer.getName() + ":");
        for (Order order : customerOrders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Order Details: " + order.getOrderDetails());
        }
    }
}
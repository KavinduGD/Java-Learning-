package Dependency;

class Order {
    private int orderId;
    private SalesPerson salesPerson;
    
    public Order(int orderId, SalesPerson salesPerson) {
        this.orderId = orderId;
        this.salesPerson = salesPerson;
    }
    
    public void processOrder() {
        System.out.println("Processing order " + orderId + " by salesperson " + salesPerson.getName());
        // Perform order processing logic
    }
}
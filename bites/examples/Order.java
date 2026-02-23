package bites.examples;

public class Order {
    Integer total = 0;

    public Integer getTotal() {
        return this.total;
    }

    public void addAmount(Integer amount) {
        this.total += amount;
    }

    public void addDiscount(Integer discount) {
        this.total -= discount;
    }
    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.addAmount(20);
        myOrder.addDiscount(2);
        System.out.println("£" + myOrder.getTotal());
    }
}

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

    private String friendlyTotal() {
        return String.format("Thanks! The total value of your order is £%d", this.total);
    }

    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.addAmount(20);
        myOrder.addDiscount(2);
        Integer total = myOrder.getTotal();
        String stringTotal = myOrder.friendlyTotal();
        System.out.println("£" + total);
        System.out.println(stringTotal);
    }
}

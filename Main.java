class Main {
    public static void main(String[] args) {
        Order keyboard = new Order();
        keyboard.setItem("keyboard");
        keyboard.setQuantity(10);
        keyboard.setUnitPrice(300.0);
        keyboard.setPaymentMode(new GCash());
        keyboard.setTotalAmount();

        Order keyboard1 = new Order("keyboard", 10, 300.0, new Maya());


        Order keyboard2 = new Order();
        keyboard2.setItem("keyboard");
        keyboard2.setQuantity(10);
        keyboard2.setUnitPrice(300.0);
        keyboard2.setPaymentMode(new ShoppeePay());
        keyboard2.setTotalAmount();

        System.out.println("Order item is " + keyboard.getItem() + ".");
        System.out.println("Unit price is " + keyboard.getUnitPrice());
        System.out.println("Quantity is " + keyboard.getQuantity());

        System.out.println("\nPayment order details if " + keyboard.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + keyboard.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard.getTotalAmount());

        System.out.println("\nPayment order details if " + keyboard1.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + keyboard1.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard1.getTotalAmount());

        System.out.println("\nPayment order details if " + keyboard2.getPaymentMode().getClass().getSimpleName());
        System.out.printf("Discount rate is %.2f%n", keyboard2.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard2.getTotalAmount());
    }
}
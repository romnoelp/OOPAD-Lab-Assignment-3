public class Order {
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private PaymentMode paymentMode;

    public Order() {

    }

    public Order(String item, Integer quantity, Double unitPrice, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMode = paymentMode;
        this.setTotalAmount();
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        Double initialAmount = unitPrice * quantity;
        this.totalAmount = initialAmount - (paymentMode.determineDiscountRate() * initialAmount);
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}

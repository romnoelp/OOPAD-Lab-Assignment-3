public class ShoppeePay implements PaymentMode{
    @Override
    public Double determineDiscountRate() {
        return 0.10;
    }
}

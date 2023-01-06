public class PaymentContext {

    private IPaymentStrategy paymentStrategy;

    public PaymentContext(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}

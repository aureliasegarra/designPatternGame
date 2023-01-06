public class CreditCard implements IPaymentStrategy{
    private int amount;

    @Override
    public void pay(int amount){
        System.out.println("You pay by credit card" + amount);
    }
}

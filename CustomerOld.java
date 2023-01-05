public class CustomerOld {
    /**
     * paymentStrategy : 1 Cash, 2 Check, 3 DebitCard
     */
    private int paymentStrategy;

    public CustomerOld(int paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        if (paymentStrategy == 1)
            this.payCash(amount);
        else if (paymentStrategy == 2)
            this.payCheck(amount);
        else if (paymentStrategy == 3)
            this.payDebitCard(amount);
        else System.out.println("Wrong number " + this.paymentStrategy);
    }

    public void payCash(int amount) {
        System.out.println("Charged " + amount + " using Cash...");
        System.out.println("Thank you!!");
    }

    public void payDebitCard(int amount) {
        System.out.println("Charging " + amount + " using Debit Card...");
        System.out.println("Thank you!!");
    }

    public void payCheck(int amount) {
        System.out.println("Charging " + amount + " using Check...");
        System.out.println("Thank you!!");
    }
}

public class TestStrategy {
    public static void main(String[] args) {
        CustomerOld customer1 = new CustomerOld(3);
        customer1.pay(1000);

        CustomerOld customer2 = new CustomerOld(1);
        customer2.pay(500);

    }
}

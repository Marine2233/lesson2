package systenPay;

public class MoneyPay extends Pay{
    public MoneyPay(String namePay, double totalPay) {
        super(namePay, totalPay);
    }

    @Override
    public void pay() {
        System.out.println("Оплата наличными.");
    }
}

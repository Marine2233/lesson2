package systenPay;

public class CryptoPay extends Pay{
    public CryptoPay(String namePay, double totalPay) {
        super(namePay, totalPay);
    }

    @Override
    public void pay() {
        System.out.println("Оплата Крипто.");
    }
}

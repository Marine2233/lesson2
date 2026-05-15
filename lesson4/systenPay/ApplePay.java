package systenPay;

public class ApplePay extends Pay{
    public ApplePay(String namePay, double totalPay) {
        super(namePay, totalPay);
    }

    @Override
    public void pay() {
        System.out.println("Оплата Apple pay." );
    }
}

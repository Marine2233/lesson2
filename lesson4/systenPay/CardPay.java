package systenPay;

public class CardPay extends Pay{
    public CardPay(String namePay, double totalPay) {
        super(namePay, totalPay);
    }

    @Override
    public void pay() {
        System.out.println("Оплата картой.");
    }
}

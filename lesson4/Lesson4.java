import systenPay.*;

import java.util.ArrayList;

public class Lesson4 {
    public static void main(String[] args) {

//        CreditCard creditCard = new CreditCard("1654655153","Name", 25478.25);
//        DebitCard debitCard = new DebitCard("251323232156165","Knkjkj", 1656511.25);
//        VirtualCard virtualCard = new VirtualCard("15655","bghvyu",00.00);
//
//        creditCard.info();
//        System.out.println();
//        debitCard.info();;
//        System.out.println();
//        virtualCard.info();
//        System.out.println();
//
//        debitCard.cardPay();
//        debitCard.qrPay();
//        System.out.println();
//        creditCard.cardPay();
//        creditCard.qrPay();
//        System.out.println();


        ArrayList<Pay> list = new ArrayList<>();
        list.add( new ApplePay("Apple", 115.22));
        list.add( new MoneyPay("Money",55.23));
        list.add( new CryptoPay("Crypto",5789.22));
        list.add( new CardPay("Card", 458.36));

        list.stream().forEach(Pay::info);


    }
}

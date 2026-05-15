package systenPay;

import java.util.ArrayList;

public abstract class Pay {
    public String namePay;
    public double totalPay;
    public boolean pay;




    public Pay(String namePay, double totalPay) {
        this.namePay = namePay;
        this.totalPay = totalPay;
        this.pay = true;


    }

    public abstract void pay();


    public void info(){
        System.out.println("название платежа: " + namePay + "\n сумма оплаты: "+ totalPay + "\n оплата: " + pay);
    }
}

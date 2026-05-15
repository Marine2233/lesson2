public abstract class Cards {
    public String numCard;
    public String nameClient;
    public double balance;

    public Cards(String numCard, String nameClient, double balance){
        this.numCard = numCard;
        this.nameClient = nameClient;
        this.balance = balance;
    }

    public void info(){
        System.out.println("Номер карты: " + numCard + " Клиент: " + nameClient + "\n баланс: " + balance);
    }
}

public class BancAccount {
    private double amount;
    public BancAccount(double amount){
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount +=sum;
    }
    public void withDraw(int sum) throws LimitException{
        if (sum >this.amount){
            throw new LimitException("Недостаточно средств", this.amount);
        }else {
            this.amount -=sum;
            this.amount = this.amount - sum;
            System.out.println("\uD83D\uDC4BВы отозвали:" + sum + "\uD83D\uDCB5Сом");
            System.out.println("\uD83D\uDCB3Ваш баланс:" + this.amount + "\uD83D\uDCB5Сом");

        }
    }
}

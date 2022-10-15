public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }
    public void deposit(Double som){
        amount = amount + som;
        System.out.println("Вы поплнили баланс на: " + som);

    }
    public double withDraw(Double som) throws AmountException{
        if (amount - som < 0) {
            throw new AmountException("Операция недоступна, недостаточно средств на счету " + amount, amount);
        }
        amount = amount - som;
        System.out.println("Вы сняли: " + som +
                "сом   " + "Остаток на счету: " + amount);
        return amount;
    }
}

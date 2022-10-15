public class AmountException extends Exception{
    private Double remainingAmount;
    public AmountException(String message, Double amount){
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public double getRemainingAmount() {
        System.out.println("Операция недоступна " + remainingAmount);
        return remainingAmount;
    }

}

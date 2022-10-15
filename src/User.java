public class User {
    public static void n() {
        Account account = new Account();
        account.deposit(20000.0);

        while (true){
            try {account.withDraw(6000.0);
            }catch (AmountException exception){
                System.out.println(exception.getMessage());
                try {
                    account.withDraw(account.getAmount());
                } catch (AmountException exception1) {
                    System.out.println(exception1.getMessage());
                }
                break;
            }
        }
    }
}

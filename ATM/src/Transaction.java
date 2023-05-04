public class Transaction {
    private int transaction_id;
    private String date;
    private String status;
    private double transactionAmount;
    private BankAccount bankAccount;

    public Transaction(int transaction_id, BankAccount bankAccount, String date, String status, double transactionAmount) {
        this.transaction_id = transaction_id;
        this.bankAccount= bankAccount;
        this.date = date;
        this.status = status;
        this.transactionAmount = transactionAmount;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }
}
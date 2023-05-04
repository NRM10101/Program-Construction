import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    Scanner input=new Scanner(System.in);
    private ArrayList<Client> clients=new ArrayList<>();//all clients
    private ArrayList<Transaction> transactions=new ArrayList<>();//transactions

    public ATM(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    public ArrayList<BankAccount> getBankAccounts(Client client) { // return all the bank account client has
        return client.getAccounts();
    }

    public void viewBalance(BankAccount bankAccount) {
        System.out.println("Balance = "+bankAccount.getBalance()+" "+bankAccount.getCurrency());
    }
    public void withdrawMoney(BankAccount bankAccount) {
        System.out.print("Enter the amount :");
        int amount=input.nextInt();
        if(bankAccount.getBalance()-amount >0){
            bankAccount.setBalance(bankAccount.getBalance()-amount);//recoded final balance
            String status="Transaction is success";
            transactions.add(new Transaction(bankAccount.getAccountNumber()+10,bankAccount,"2023/04/24",status,amount));
        }else{
            System.out.println("Transaction is failure. You don't have enough money");
        }

    }
    public void depositMoney(BankAccount bankAccount) {
        System.out.print("Enter the amount :");
        int amount=input.nextInt();
        bankAccount.setBalance(bankAccount.getBalance()+amount);//recorded final balance
        String status="Transaction is success";
        transactions.add(new Transaction(bankAccount.getAccountNumber()+10,bankAccount,"2023/04/24",status,amount));
    }
}
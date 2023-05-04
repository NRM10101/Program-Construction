import java.util.ArrayList;

public class Client {
    private int client_id;
    private String name;
    private String nationality;
    private String occupation;
    private String address;
    private int age;
    private String gender;
    private ArrayList<BankAccount> accounts=new ArrayList<>();
    private int pin;

    public Client(int client_id, String name, String nationality, String occupation, String address, int age, String gender,int pin) {
        this.client_id = client_id;
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.pin=pin;
    }

    public String getName() {
        return name;
    }

    public int getClient_id() {
        return client_id;
    }
    public void createBankAccount(int accountNumber, String currency, String branch, double balance){//create normal bank account
        accounts.add(new BankAccount(accountNumber,currency,branch,balance));
    }
    public void creatSavingAccount(int accountNumber, String currency, String branch, double balance){//create normal bank account
        accounts.add(new SavingAccout(accountNumber,currency,branch,balance));
    }
    public int getPin() {
        return pin;
    }
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}

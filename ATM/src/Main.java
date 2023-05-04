import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Client> clients=new ArrayList<>();
        Client client01=new Client(101,"Saman","Sinhalies","Student","23/73",21,"Male",10);
        Client client02=new Client(102,"Janith","Sinhalies","Student","23/73",21,"Male",20);
        Client client03=new Client(102,"Janith","Sinhalies","Student","23/73",21,"Male",30);

        client01.createBankAccount(1984905,"Rs","Ambalanagoda",1000);
        client01.createBankAccount(1775509,"Rs","Ambalanagoda",1000);
        client02.createBankAccount(9999789,"Rs","Ambalanagoda",1000);
        client02.createBankAccount(7732121,"Rs","Ambalanagoda",1000);

        clients.add(client01); //Clients
        clients.add(client02);
        clients.add(client03);
        ATM atm=new ATM(clients);
        System.out.println("pins:10,20,30");
////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Welcome!");
        while(true){
            System.out.print("Enter the pin :");
            int pin= input.nextInt();
            for(Client client:atm.getClients()) {
                if (pin == client.getPin()) { // find a client for inputed pin

                    //ATM atmCard = client01.getAtmCard();

                    //print client bank accounts
                    System.out.println("Account numbers of "+client.getClient_id()+"("+client.getName()+")");
                    for (BankAccount bankAccount : atm.getBankAccounts(client)) { //client have several  bank account find one
                        System.out.println(bankAccount.getAccountNumber());
                    }
                    System.out.print("Enter bankAccount number:");
                    int bankAccountNumber = input.nextInt();
                    for (BankAccount bankAccount : atm.getBankAccounts(client)) { //find clients wants bank account of all bank account of client already has
                        if (bankAccount.getAccountNumber() == bankAccountNumber) { //found client wants bank account
                            //bankAccount--founded
                            System.out.println("1. View Balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
                            System.out.print("Choose your option:");
                            int op=input.nextInt();
                            if(op==1){
                                atm.viewBalance(bankAccount);
                            } else if (op==2) {
                                atm.withdrawMoney(bankAccount);
                            } else if (op==3) {
                                atm.depositMoney(bankAccount);
                            } else if (op==4) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
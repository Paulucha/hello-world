package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();

        String file = "C:\\Users\\Paulucha\\Desktop\\programowanie\\KURSY\\hello-world\\Udemy courses\\Practice Java by Building Projects\\NewBankAccounts.csv";
        List<String[]> newCustomers = utilities.CSV.read(file);

        for (String[] customer : newCustomers) {
            String name = customer[0];
            String sSN = customer[1];
            String accountType = customer[2];
            double initDeposit = Double.parseDouble(customer[3]);

            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name, sSN, initDeposit));

            } else if (accountType.equals("Checking")) {

                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("CANNOT READ ACCOUNT TYPE");
            }


            }
        accounts.get(4).showInfo();
        }
    }


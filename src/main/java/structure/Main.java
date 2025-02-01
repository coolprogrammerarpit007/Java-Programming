package structure;
import structure.Account;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(78541565,"Arpit Mishra",500000);
//        System.out.println(account1);
        String name = account1.getAccountHolderName();
//        System.out.println(name);

//        System.out.println(account1.deposit(50000));
        System.out.println(account1.withdraw(600000));
    }
}

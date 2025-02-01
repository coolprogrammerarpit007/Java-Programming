package structure;

//import java.math.int;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // constructor

    public Account(int accountNumber,String accountHolder,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//    method to get the owner.

    public String getAccountHolderName()
    {
        return this.accountHolder;
    }

//    set accountHolder Name;
    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    // get account number

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    // setting the account number

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    // update Balance of the account
    public double deposit(double amount)
    {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount)
    {
        String message = "";
        if(amount < this.balance)
        {
            this.balance -= amount;
        }
        return this.balance;
//        message = "You do not have enough balance for withdrawal!";
//        System.out.println(message);
//        return 0;

    }
}

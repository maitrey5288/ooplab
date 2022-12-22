import java.util.Scanner;

// Interface Account
interface Account {
    void set(String name,int accountNumber ,double balance);
    void display();
}

// Interface Person
interface Person {
    void store();
    void disp();
}

// Class Customer
 class Customer implements Person, Account {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor to initialize name, account number, and balance
    public Customer() {
    }

    // Method to set the account information
    public void set(String name,int accountNumber ,double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

        // Code to set the account information
    }


    public void display() {
        //
    }

    // Method to display the account information
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        // Code to calculate and display the interest
        double p, r, t, si; // principal amount, rate, time and simple interest respectively.
        p = balance; r = 12; t = 1;
        si = (p*r*t)/100;
        System.out.println("Simple interest is: "+si);
    }

    // Method to store the person's information
    public void store() {
        // Code to store the person's information
    }
 }
public class multipleinheritance_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();
        Customer c = new Customer();
        c.set(name ,accountNumber,balance);
        sc.close();
        c.display();
        c.store();
        c.disp();
    
}
}

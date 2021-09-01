/* Section 6 : Constructors - Part 1: Challenge Exercise */

package masterclass.learnprogramming;

public class Account {
    public static void main(String[] args) {
        Account john = new Account("12345", 0, "John", "Smith", "john@gmail.com", "210-555-5555");

        System.out.println(john.getFullName());
        System.out.println(john.getAccountNumber());
        System.out.println("$" + john.getBalance());
        System.out.println(john.getEmail());
        System.out.println(john.getPhoneNumber());
        john.depositFunds(25.42);
        System.out.println("$" + john.getBalance());
        john.withdrawFunds(5.42);
        System.out.println("$" + john.getBalance());
        john.withdrawFunds(21);
        System.out.println("$" + john.getBalance());
    }

    private String accountNumber;
    private double accountBalance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Account(String accountNumber, double accountBalance, String firstName, String lastName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(long balance) {
        this.accountBalance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void depositFunds(double funds) {
        System.out.println("Previous balance = " + "$" + accountBalance);
        accountBalance += funds;
        System.out.println("New balance = " + "$" + accountBalance);
    }

    public void withdrawFunds(double funds) {
        if (accountBalance < funds) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Previous balance = " + "$" + accountBalance);
            accountBalance -= funds;
            System.out.println("New balance = " + "$" + accountBalance);
        }
    }
}

/* Section 6 : Constructors - Part 2: Challenge Exercise */

package masterclass.learnprogramming;

public class VipCustomer {
    public static void main(String[] args) {
        VipCustomer nic = new VipCustomer();
        VipCustomer matt = new VipCustomer("Matty Matt", "mattymatt@gmail.com");
        VipCustomer jon = new VipCustomer("Jon Jon", 1000, "jonjon@gmail.com");
        System.out.println("Jon's credit = " + jon.getCreditLimit());
        System.out.println("Jon's name = " + jon.getName());
        System.out.println("Jon's email = " + jon.getEmailAddress());

        System.out.println("Matt's credit= " + matt.getCreditLimit());
        System.out.println("Matt's name = " + matt.getName());
        System.out.println("Matt's email = " + matt.getEmailAddress());

        System.out.println("Nic's credit = " + nic.getCreditLimit());
        System.out.println("Nic's name = " + nic.getName());
        System.out.println("Nic's email = " + nic.getEmailAddress());
    }

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("N/A", 500, "N/A");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 500, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

package oops;

public class SBI implements Bank{
    @Override
    public void interest() {
        System.out.println("8%");
        System.out.println("___________________________");
    }

    @Override
    public void loan() {
        System.out.println("Home Loan");
        System.out.println("Gold Loan");
        System.out.println("Education Loan");
        System.out.println("___________________________");
    }

    @Override
    public void charges() {
        System.out.println("Overdue Charges");
        System.out.println("Check Bounces Charges");
        System.out.println("Late Fee Charges");
    }
}

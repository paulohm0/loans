
public class Main {

    public static void main(String[] args) {

        Client paulo = new Client("Paulo", 28, "6546598798", 5000.00, "CE");
        System.out.println(paulo.toString());
        paulo.setLoan(new Loan(paulo.getIncome(), paulo.getLocale(), paulo.getAge(), "Payroll Loan", 5000));
        System.out.println(paulo.getLoan());
    }
}
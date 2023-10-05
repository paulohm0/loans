import java.util.Objects;

public class Loan {

    private String loanType;
    private double initialLoanValue;
    private double finalLoanValue;
    private double fees;

    public Loan(double income, String locale, int age, String loanType, double initialLoanValue) {

        this.loanType = loanType;
        this.initialLoanValue = initialLoanValue;

        switch (this.loanType) {

            case "Personal Loan" :
            validatePersonalLoan(income, locale, age);
            this.finalLoanValue = initialLoanValue + initialLoanValue * 0.04;
            this.fees = 0.04;
            break;

            case "Payroll Loan" :
            validatePayrollLoan(income);
            this.finalLoanValue = initialLoanValue + initialLoanValue * 0.02;
            this.fees = 0.02;
            break;

            case "Guarantee Loan" :
            validateGuaranteeLoan(income, locale, age);
            this.finalLoanValue = initialLoanValue + initialLoanValue * 0.03;
            this.fees = 0.03;
            break;

            default :
            System.out.println("Opção invalida");
            break;
            }
        }

    @Override
    public String toString() {
        return "Loan{" +
                "loanType='" + loanType + '\'' +
                ", initialLoanValue=" + initialLoanValue +
                ", finalLoanValue=" + finalLoanValue +
                ", fees=" + fees +
                '}';
    }

    public boolean validatePersonalLoan(double income, String locale, int age) {
        if (income <= 3000.00 ||
            income >= 3000.00 &&
            income <= 5000.00 &&
            Objects.equals(locale, "SP") &&
            age < 30) {
            System.out.println("Parabéns, o senhor tem direito ao Empréstimo Pessoal");
            return  true;
        } else {
            System.out.println("O senhor(a) não pode fazer esse método de empréstimo");
            return false;
        }
    }

    public boolean validatePayrollLoan(double income) {
        if(income >= 5000.00) {
            System.out.println("Parabéns, o senhor tem direito ao Empréstimo Consignado");
            return true;
        } else {
            System.out.println("O senhor(a) não pode fazer esse método de empréstimo");
            return false;
        }
    }

    public boolean validateGuaranteeLoan(double income, String locale, int age) {
        if(income <= 2500.00 ||
           income >= 4500.00 &&
           income <= 7000.00 &&
           Objects.equals(locale, "CE") &&
           age < 27) {
           System.out.println("Parabéns, o senhor tem direito ao Empréstimo com Garantia");
           return true;
        } else {
           System.out.println("O senhor(a) não pode fazer esse método de empréstimo");
           return false;
        }
    }
}






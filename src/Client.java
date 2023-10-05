public class Client{

    private String name;
    private int age;
    private String cpf;
    private double income;
    private String locale;
    private Loan loan;

    public Client(String name, int age, String cpf, double income, String locale) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.income = income;
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpf='" + cpf + '\'' +
                ", income=" + income +
                ", locale='" + locale + '\'' +
                '}';
    }

    public Loan getLoan() {
        return loan;
    }
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCpf() {
        return cpf;
    }
    public double getIncome() {
        return income;
    }
    public String getLocale() {
        return locale;
    }
}

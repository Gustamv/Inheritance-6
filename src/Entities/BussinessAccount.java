package Entities;

public class BussinessAccount  extends Account{
    private Double loanLimit;
    public BussinessAccount() {
        super();
    }
    //passar os dados herdados usa-se super()

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        //super puxa o construtor da superclasse
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        if(amount <= loanLimit) {
            //supondo que para realizar emprestimo, custe 10
            balance += amount - 10;

        }
    }
    @Override
    public void withdraw(double amount) {
        //condicao que no saque eh descontado 2 do saldo
        //esse super recria as condições do withdraw da superclasse
        super.withdraw(amount);
        balance -= 2.0;
    }

}

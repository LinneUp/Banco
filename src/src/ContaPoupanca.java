package src;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(String titular, String agencia, String banco, int saldo, int diaAniversario, double taxaDeJuros) {
        super(titular, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }


    public double getSaldo(int dia) {
        if (dia >= this.diaAniversario) {

            this.saldo = this.saldo + this.taxaDeJuros * this.saldo;
            return this.saldo;
        }
        else
            return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return true;
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }

    @Override
    public double getValorImpostoSaque() {
        return 0;
    }
}

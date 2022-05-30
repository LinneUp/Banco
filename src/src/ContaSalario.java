package src;

public class ContaSalario extends Conta {

    private String empresa;
    private int salario;

    public ContaSalario(String titular, int agencia, String banco, int saldo, int empresa, int salario) {
        super(titular, agencia, banco, saldo);
        this.salario = salario;
    }



    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return true;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public double getValorImpostoSaque() {
        return 0;
    }
}

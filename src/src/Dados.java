package src;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    private List<Conta> contas = new ArrayList<>();
    Conta conta1, conta2;

    public List<Conta> getContas() {
        return contas;
    }
    public void addNovaConta(Conta novaConta) {
        contas.add(novaConta);
    }


    String titular;
    String tipoconta;
    int numero;

    double pValor;

    public int getNumero(int numero) {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getpValor() {
        return pValor;
    }

    public void setpValor(double pValor) {
        this.pValor = pValor;
    }

    public Dados() {
        super();
        this.titular = titular;
        this.tipoconta = tipoconta;
        this.numero = numero;
        this.pValor = pValor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public Conta getConta1() {
        return conta1;
    }

    public void setConta1(Conta conta1) {
        this.conta1 = conta1;
    }

    public Conta getConta2() {
        return conta2;
    }

    public void setConta2(Conta conta2) {
        this.conta2 = conta2;
    }

    public Dados(Conta conta1, Conta conta2) {
        this.conta1 = conta1;
        this.conta2 = conta2;
    }
}

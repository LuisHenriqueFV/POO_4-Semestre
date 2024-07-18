package Model;

public class ContaCorrente extends Conta implements Associado {

    public ContaCorrente() {
        super(0); // Define saldo inicial como 0 caso não seja passado
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    @Override
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + "]";
    }
}

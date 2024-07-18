package Model;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public abstract void atualiza(double taxa);

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [saldo=" + saldo + "]";
    }
}

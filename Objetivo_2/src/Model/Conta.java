package Model;

public abstract class Conta {
    protected double saldo;
    public void depositar(double valor){
        System.out.println("Depositando...");
    }
    public void saca(double valor){
        System.out.println("Sacando...");
    }
    public void atualiza(double valor){
        System.out.println("Atualizando...");
    }

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}

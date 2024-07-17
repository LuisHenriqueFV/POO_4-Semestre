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

}

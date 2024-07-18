package Model;

public class Conta {
    private double saldo;
    public double getSaldo(){
        return saldo;
    }
    public void deposita(double valor){
        saldo += valor;
    }
    public void saca(double valor){
        saldo -= valor;
    }
    public void atualiza(double valor){
        System.out.println("atualizando....");
    }
}

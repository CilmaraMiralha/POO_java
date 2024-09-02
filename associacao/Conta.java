public class Conta {

    int numero;
    Pessoa correntista;
    private float saldo;

    public Conta(){}

    public Conta(int numero, Pessoa correntista){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = 0.00f;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public boolean sacar(float valor){
        if(this.saldo - valor >=0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }



}
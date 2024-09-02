public class Conta {
    
    int numero;
    String correntista;
    float saldo;

    //Construtor padrão
    public Conta(){}

    //Sobrecarga do construtor
    public Conta(int numero, String correntista, float saldo){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    //Outra sobrecarga
    public Conta(int numero, String correntista){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo=0.00f;
    }

    public void depositar(float valor){
        this.saldo = this.saldo+valor;
    }

    public boolean sacar(float valor){
        if(this.saldo - valor >=0){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
}

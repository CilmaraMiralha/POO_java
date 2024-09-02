public class Conta {
    private int codigo;
    private String correntista;
    private float saldo;

    public float getSaldo(){
        return this.saldo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getCorrentista(){
        return this.correntista;
    }

    public void setCorrentista(String correntista){
        this.correntista = correntista;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public boolean sacar(float valor){
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}

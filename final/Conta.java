public class Conta {
    private int numero;
    private Pessoa correntista;
    private float saldo;

    public final static int SACAR = 0;
    public final static int DEPOSITAR = 1;

    public Conta(){}
    public Conta(int numero, Pessoa correntista){
        this.numero = numero;
        this.correntista = correntista;
    }

    public final int getNumero() {
        return numero;
    }

    public final Pessoa getCorrentista() {
        return correntista;
    }

    public final float getSaldo() {
       return saldo;
    }

    public final  void setNumero(int numero) {
        this.numero = numero;
    }

    public final void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    protected final void setSaldo(float saldo){
        this.saldo = saldo;
    }


    public boolean movimentar(float valor, int operacao){
        if(operacao == Conta.DEPOSITAR){
            this.saldo += valor;
            return true;
        }else if(operacao == Conta.SACAR){
            if(this.saldo - valor >= 0){
                this.saldo -= valor;
                return true;
            }
        }
        return false;
    }
}

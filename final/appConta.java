public class appConta {
    public static void main(String[] args) {
        Pessoa correntista = new Pessoa("Maria","maria@mail.com",123321);
        Conta conta = new Conta(1234,correntista);

        System.out.println("Saldo atual da conta: R$"+conta.saldo);

        conta.movimentar(500f,Conta.DEPOSITAR);

        System.out.println("Saldo após deposito: R$"+conta.saldo);

        if(conta.movimentar(200f,Conta.SACAR))
            System.out.println("Saldo após saque: R$"+conta.saldo);
        else
            System.out.println("Não foi possível sacar pois não há saldo suficiente");
    }
}

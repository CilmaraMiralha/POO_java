public class appConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(500.00f);

        conta.setCodigo(1234);
        conta.setCorrentista("Fulano");

        System.out.println("Número da conta.......: "+conta.getCodigo());
        System.out.println("Correntista...........: "+conta.getCorrentista());
        System.out.printf("Saldo...........: R$ %.2f", conta.getSaldo());

        if (conta.sacar(100f)){
            System.out.println("Saque realizado com sucesso.");
            System.out.printf("O saldo atualizado é R$ %.2f",conta.getSaldo());
        }
        else{
            System.out.println("Não foi possível realizar o saque.");
        }

    }
}

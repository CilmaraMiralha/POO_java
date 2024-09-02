public class appConta {

    public static void main(String []args){
        Pessoa pessoa =new Pessoa ("Fulano", "fulano@gmail.com",999124567);
        Conta conta = new Conta(10987, pessoa);

        System.out.println("Número da conta: "+conta.numero);
        System.out.println("Nome: "+conta.correntista.getNome());
        System.out.println("E-mail: "+conta.correntista.getEmail());
        System.out.println("Celular: "+conta.correntista.getCelular());
        System.out.printf("Saldo: R$%.2f", conta.getSaldo());
    }

}
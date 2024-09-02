public class appConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(1029,"Ciclano", 153.98f);
        Conta conta3 = new Conta(1130, "Beltrano");

        conta1.numero = 1745;
        conta1.correntista = "Fulano";

        System.out.println("Dados da primeira conta");
        System.out.println("Número: "+conta1.numero);
        System.out.println("Correntista: "+conta1.correntista);
        System.out.printf("Saldo R$ %.2f",conta1.saldo);

        System.out.println("\n");

        System.out.println("Dados da segunda conta");
        System.out.println("Número: "+conta2.numero);
        System.out.println("Correntista: "+conta2.correntista);
        System.out.printf("Saldo R$ %.2f",conta2.saldo);

        System.out.println("\n");
        
        System.out.println("Dados da terceira conta");
        System.out.println("Número: "+conta3.numero);
        System.out.println("Correntista: "+conta3.correntista);
        System.out.printf("Saldo R$ %.2f",conta3.saldo);
        System.out.println("\n");

        conta1.depositar(500f);
        conta2.depositar(300f);
        conta3.depositar(450f);


        System.out.printf("Saldo conta1 atualizado R$ %.2f",conta1.saldo);
        System.out.println("\n");
        System.out.printf("Saldo conta2 atualizado R$ %.2f",conta2.saldo);
        System.out.println("\n");
        System.out.printf("Saldo conta3 atualizado R$ %.2f",conta3.saldo);
        System.out.println("\n");

        if(conta1.sacar(250f)){
            System.out.println("O saque foi realizado com sucesso!");
            System.out.printf("O saldo é R$%.2f",conta1.saldo);
            System.out.println("\n");
        }else{
            System.out.println("Não foi possível realizar o saque.");
            System.out.println("\n");
        }

        if(conta2.sacar(150f)){
            System.out.println("O saque foi realizado com sucesso!");
            System.out.printf("O saldo é R$%.2f",conta2.saldo);
            System.out.println("\n");
        }else{
            System.out.println("Não foi possível realizar o saque.");
            System.out.println("\n");
        }

        if(conta3.sacar(1000f)){
            System.out.println("O saque foi realizado com sucesso!");
            System.out.printf("O saldo é R$%.2f",conta3.saldo);
            System.out.println("\n");
        }else{
            System.out.println("Não foi possível realizar o saque.");
            System.out.println("\n");
        }
    }
}

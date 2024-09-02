public class appPessoa {
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Cilmara";
        pessoa.idade=19;
        pessoa.celular=999876543;
        pessoa.email="Cilmara@gmail.com";
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("Idade: "+pessoa.idade);
        System.out.println("Celular: "+pessoa.celular);
        System.out.println("E-mail: "+pessoa.email);
    }
}

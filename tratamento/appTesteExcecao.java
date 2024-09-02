public class appTesteExcecao {
    public static void main(String[] args) {
        String nomes[] = {"Fulano","Ciclano","Beltrano"};

        try{
            System.out.println("Nome: "+nomes[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro na tentativa de acesso ao indice["+e.getMessage()+"] invalido");
        }


        
    }
}

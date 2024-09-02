import java.util.Scanner;

public class appExemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Seu nome é "+nome);
        
    }
}

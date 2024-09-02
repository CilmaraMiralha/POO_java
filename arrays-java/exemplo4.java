import java.util.Arrays;
public class exemplo4 {
    public static void main(String[] args) {
        String nomes[]={"Fulano","Beltrano","Ciclano"};
        int indice = Arrays.binarySearch(nomes, "Ciclano");
        System.out.println("Posição de Ciclano no array: "+indice);
    }
}

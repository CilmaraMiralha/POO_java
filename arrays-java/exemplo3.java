import java.util.Arrays;
public class exemplo3 {
    public static void main(String[] args) {
        String nomes[]= new String[10];
        Arrays.fill(nomes,"aluno");
        System.out.println(Arrays.toString(nomes));
        Arrays.fill(nomes,0,4,"aluna");
        System.out.println(Arrays.toString(nomes));
    }
}

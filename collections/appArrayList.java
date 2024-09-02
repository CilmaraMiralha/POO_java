import java.util.ArrayList;
import java.util.List;

public class appArrayList {
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        for (int i = 1; i<=10; i++){
            lista1.add(i);
        }

        for(Object o: lista1){
            System.out.println(o);
        }
    }
}

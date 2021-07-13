import java.util.Scanner;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la variable N: ");
        Integer N = sc.nextInt();

        System.out.println("Ingrese la variable M: ");
        Integer M = sc.nextInt();
      
        
        sc.close();

        StringBuilder MyString = new StringBuilder(N);
        MyString = MyString.deleteCharAt(M);
        System.out.println(MyString);

    }
}

import java.util.Scanner;
import java.io.IOException;
public class Ejercicio6 {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        Integer Num = sc.nextInt(); 
        
        if (Num%10 == 0) {
            System.out.println("El numero ingresado es multiplo de 10");
        }else{
            System.out.println("El numero ingresado no es multiplo de 10");
        }
        sc.close();
    }
}

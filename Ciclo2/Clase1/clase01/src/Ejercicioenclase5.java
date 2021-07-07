package clase01.src;
import java.util.Random;
import java.util.Scanner;
public class Ejercicioenclase5 {
   
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        Random r = new Random();
        var numero1 = r.nextInt(99)+1;
        //System.out.println("Introduzca un numero de 0 a 99: \f");
        var numero2 = 0;

        while (numero1 != numero2) {
        
          System.out.println("Introduzca un numero de 1 a 100: \f");
          numero2 = sc.nextInt();
          
          if (numero2 > numero1) {
            System.out.println("Su numero es mayor ");
          }
          if (numero2 < numero1) {
            System.out.println("Su numero es menor ");
          }
          if (numero2 == numero1) {
            System.out.println("Adivinaste el numero");
          }  

        }
        sc.close();
    }    
    
}

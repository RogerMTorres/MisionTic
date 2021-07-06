package clase01.src;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
    System.out.println("Introduzca un numero entero: ");
        var numero = Sc.nextInt();
    
        var digitos = numeroDigitos(numero);
    System.out.println("El numero tiene " + digitos + " Cifras");
    Sc.close();
    } 
    

    public static int numeroDigitos(int numero) {

        var Cifras =0;
        
        while (numero !=0){

            numero/=10;
            Cifras++;
        }
        return Cifras;

        
    }
   
   
}

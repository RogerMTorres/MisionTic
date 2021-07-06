package clase01.src;

import java.util.Scanner;

public class EjercicioEnCasa4 {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner (System.in);
        System.out.println("Ingrese un numero para obtener la tabla de multiplicar:");
        int Numero = Sc.nextInt();

        System.out.println("-----------------------------------------");
        System.out.println("La tabla del " + Numero +" Es:");
        for (int i = 0; i <= 10; i++) {
                int Resutado = Numero*i;
                System.out.println(Numero +" x " + i + " = " + Resutado);
        }
        Sc.close();
    }
}

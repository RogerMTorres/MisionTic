package clase01.src;

import java.util.Scanner;

public class EjercicioEnCasa3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas trabajadas en el mes:");
        int Horas = Sc.nextInt();
        int Sueldo = Horas*30000;

        System.out.println("Su sueldo es:" + Sueldo);

        Sc.close();
    }
   
}

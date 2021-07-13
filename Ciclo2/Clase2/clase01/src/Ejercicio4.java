import java.util.Scanner;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los Kilometros Por Hora: ");
        Double Kmh = sc.nextDouble(); 
        sc.close();
        Double Ms = Kmh/3.6;
        System.out.println(Kmh +" Km/h " + "Equivalen a: " + Ms + " M/s");
    }
}

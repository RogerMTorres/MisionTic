package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercio2sm {
    public static void main(String[] args) throws IOException{
    
    System.out.println("Ingrese primer numero: ");
        float Numero1 = cargarNumero();

        System.out.println("Ingrese segundo numero: ");
        float Numero2 = cargarNumero();

        System.out.println("Ingrese tercer numero: ");
        float Numero3 = cargarNumero();

        calcularpromedio(Numero1, Numero2, Numero3);
    }

    private static float cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        float Numero = Integer.parseInt(strnumero);
        return Numero;
    }

    private static float calcularpromedio(Float N1, Float N2,Float N3){

        float Promedio = (N1 + N2 + N3)/3;
        System.out.println("el promedio es: " + Promedio);  
        return Promedio;
    }
}


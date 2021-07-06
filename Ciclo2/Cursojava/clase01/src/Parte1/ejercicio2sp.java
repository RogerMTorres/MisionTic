package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio2sp {
    public static void main(String[] args) throws IOException{

        System.out.println("Ingrese primer numero: ");
        Integer Numero1 = cargarNumero();

        System.out.println("Ingrese segundo numero: ");
        Integer Numero2 = cargarNumero();

        System.out.println("Ingrese tercer numero: ");
        Integer Numero3 = cargarNumero();

        Integer sumatoria = Numero1+Numero2+Numero3;
        Double NumeroPromedio = Double.valueOf(sumatoria)/3;
        System.out.println("El promedio es: " + NumeroPromedio);

    }   
    private static Integer cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        Integer Numero = Integer.parseInt(strnumero);
        return Numero;
    }
}

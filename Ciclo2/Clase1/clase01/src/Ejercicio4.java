package clase01.src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4 {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Ingrese la cantidad de grados centigrados: ");
            Double GradosC = Double.valueOf(cargarNumero());

        CalcularGradosF(GradosC);    
    }
    private static Integer cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        Integer Numero = Integer.parseInt(strnumero);
        return Numero;
    }
    private static Double CalcularGradosF(Double GradosC){
        Double GradosF = 32 +(9*GradosC/5);
        System.out.println(GradosC + " Grados Centigrados equivalen a: " + GradosF+ " grados farenheit.");
        return GradosF;
    }
}

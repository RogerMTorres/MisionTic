package clase01.src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio3 {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Ingrese Un numero: ");
            Integer Numero = cargarNumero();
        Calcuardoble(Numero);
        Calcuartriple(Numero);
    }
    private static Integer cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        Integer Numero = Integer.parseInt(strnumero);
        return Numero;
    }
    private static Integer Calcuardoble(Integer Num){
            Integer resultado = Num*2;
            System.out.println("el doble del numero " + Num + " es: " + resultado);
            return resultado; 
    }
    private static Integer Calcuartriple(Integer Number){
        Integer resultado = Number*3;
        System.out.println("el triple del numero " + Number + " es: " + resultado);
        return resultado; 
}
}

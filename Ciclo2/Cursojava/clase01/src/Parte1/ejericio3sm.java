package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejericio3sm {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Ingrese Un numero: ");
            Integer Numero = cargarNumero();

        Calparoimpar(Numero);
    }
    private static Integer cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        Integer Numero = Integer.parseInt(strnumero);
        return Numero;
    }

    private static void Calparoimpar(Integer Num){

        if (Num%2 ==0) {
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }

    }
}

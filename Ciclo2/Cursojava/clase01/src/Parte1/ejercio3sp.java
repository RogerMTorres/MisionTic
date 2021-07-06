package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercio3sp {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Ingrese Un numero: ");
            Integer Numero = cargarNumero();
            // ↓↓↓ forma para convertir la variable a double ↓↓↓
            // double Numero = Double.valueOf(cargarNumero());

                        boolean Espar=(Numero%2) ==0;
        // ↑↑↑ otra forma para expresar esto mismo seria ↑↑↑
        //  boolean Espar=(Numero/2) ==Math.round(Numero/2);
        //recordar que para usar esta forma la variable la tengo que convertir a double

        if (Espar) {
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
    private static Integer cargarNumero() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strnumero= br.readLine();
        Integer Numero = Integer.parseInt(strnumero);
        return Numero;
    }

}

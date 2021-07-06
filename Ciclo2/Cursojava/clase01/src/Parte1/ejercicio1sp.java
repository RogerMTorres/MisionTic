package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//respuesta del primer ejercicio del profesor
public class ejercicio1sp {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Ingrese primer numero: ");
        
        String strn1= br.readLine();
        Integer N1 = Integer.parseInt(strn1);

        System.out.println("Ingrese segundo numero: ");
        
        String strn2= br.readLine();
        Integer N2 = Integer.parseInt(strn2);

        System.out.println("Ingrese tercer numero: ");
        
        String strn3= br.readLine();
        Integer N3 = Integer.parseInt(strn3);

        Integer Numeromayor=N1;

        if (N2>Numeromayor) {
            
            Numeromayor=N2;
        }
        if (N3>Numeromayor) {
            
            Numeromayor=N3;
        }

        System.out.println("EL NUMERO MAYOR ES: " + Numeromayor);
        Integer Numeromenor=N1;

        if (N2<Numeromenor) {
            
            Numeromenor=N2;
        }
        if (N3<Numeromenor) {
            
            Numeromenor=N3;
        }

        System.out.println("EL NUMERO MENOR ES: " + Numeromenor);
    }    
}

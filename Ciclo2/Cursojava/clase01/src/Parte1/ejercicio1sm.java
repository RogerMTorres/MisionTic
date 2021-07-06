package clase01.src.Parte1;
//respuesta del primer ejercicio mia
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1sm {
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

        
        if (N1>N2 & N1>N3) {
            System.out.println( N1 +" ES EL NUMERO MAYOR");
           if (N2>N3) {
            System.out.println( N3 +" ES EL NUMERO MENOR");
        }   else{
            System.out.println( N2 +" ES EL NUMERO MENOR");
        }}
        if (N2>N1 & N2>N3) {
            System.out.println( N2 +" ES EL NUMERO MAYOR");
           if (N1>N3) {
            System.out.println( N3 +" ES EL NUMERO MENOR");
        }   else{
            System.out.println( N1 +" ES EL NUMERO MENOR");
        }}
        if (N3>N1 & N3>N2) {
            System.out.println( N3 +" ES EL NUMERO MAYOR");
           if (N1>N2) {
            System.out.println( N2 +" ES EL NUMERO MENOR");
        }   else{
            System.out.println( N1 +" ES EL NUMERO MENOR");
        }}

        if ((N1==N2)|(N1==N3)|(N2==N3)) {
            System.out.println( "LOS NUMEROS SON IGUALES");
        }
    }   
}

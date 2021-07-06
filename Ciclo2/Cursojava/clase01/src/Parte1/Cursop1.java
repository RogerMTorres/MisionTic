package clase01.src.Parte1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cursop1 {
    public static void main(String[] args) throws IOException{

    /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Por favor ingrese su nombre");
    
    String nombre = br.readLine();

    System.out.println("Hola " + nombre);*/
    

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Ingrese su edad");
    
    String strEdad = br.readLine();
    Integer edad = Integer.parseInt(strEdad);
    
    if (edad>=18) {
         
       System.out.println("es mayor de edad"); 
    } else
     {
       System.out.println("es menor de edad");
    }
}

    
}

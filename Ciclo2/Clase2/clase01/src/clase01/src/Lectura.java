package clase01.src;
import java.util.Scanner;
import java.io.IOException;

public class Lectura {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fn = sc.nextLine();
        String[] fn1 = fn.split("/");
        System.out.println(fn1[0]);
        int dia = Integer.parseInt(fn1[0]);
        //System.out.println(dia);
        int mes = Integer.parseInt(fn1[1]);
        //System.out.println(mes);
        int anio = Integer.parseInt(fn1[2]);
        //System.out.println(anio);
        var sum = dia + mes + anio;
        System.out.println(sum);

        var ns = 0;
        while(sum > 0){
            ns = ns + sum % 10;
            sum /= 10;

        }
        System.out.println("Su numero de la suerte es: " + ns);
        sc.close();
    }

    
}

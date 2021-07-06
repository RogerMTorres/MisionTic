package clase01.src.Parte1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cursop2funcion {
    public static void main(String[] args) throws IOException{

        System.out.println("Ingrese primer numero: ");
        Integer Numero1 = cargarNumero();

        System.out.println("Ingrese segundo numero: ");
        Integer Numero2 = cargarNumero();

        System.out.println("Ingrese tercer numero: ");
        Integer Numero3 = cargarNumero();

        Calcularnumeromayor(Numero1, Numero2, Numero3);
        Calcularnumeromenor(Numero1, Numero2, Numero3);
    }   
        private static Integer cargarNumero() throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strnumero= br.readLine();
            Integer Numero = Integer.parseInt(strnumero);
            return Numero;
        }
        /** 
         * esta funcion sirve para calcular el numero mayor
         * @param N1 este es el primero numero
         * @param N2 este es el segundo numero
         * @param N3 este es el tercer numero
         * @return
         */
        private static Void Calcularnumeromayor(Integer N1, Integer N2,Integer N3){

        Integer Numeromayor=N1;
        if (N2>Numeromayor) {
            Numeromayor=N2;
        }
        if (N3>Numeromayor) {
            Numeromayor=N3;
        }

        System.out.println("EL NUMERO MAYOR ES: " + Numeromayor);
        return null;
    }    

    private static Void Calcularnumeromenor(Integer N1, Integer N2,Integer N3){
        
        Integer Numeromenor=N1;
        if (N2<Numeromenor) {
            Numeromenor=N2;
        }
        if (N3<Numeromenor) {
            Numeromenor=N3;
        }
        System.out.println("EL NUMERO MENOR ES: " + Numeromenor);
        return null; 
    }
}

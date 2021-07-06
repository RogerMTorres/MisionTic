package clase01.src.Parte2;

public class Ejercicio1_primos_Sm {
    public static void main(String[] args){
        
        String resultado = "";
        int contador = 0;
        int numero =1;
        while (contador < 100) {
            if (Esprimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println ("Los primeros 100 numeros primos son: "+resultado);
    }
    private static Boolean Esprimo(Integer numero){
        Boolean EsunnumeroPrimo = true;
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0) {
                EsunnumeroPrimo =false;
            }
        }
        return EsunnumeroPrimo;
    }
}

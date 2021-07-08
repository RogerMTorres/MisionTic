import java.util.Scanner;
import java.io.IOException;
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String Producto = sc.nextLine();

        System.out.println("Ingrese el Precio sin iva: ");
        Integer ProductoSinIva = sc.nextInt();

        System.out.println("Ingrese la cantidad de productos vendidos: ");
        Integer cantidadproducto = sc.nextInt();

        System.out.println("Ingrese el porcentaje de iva a aplicar:");
        Double PorcentajeIva = sc.nextDouble();

        Double Iva = ProductoSinIva * (PorcentajeIva/100);
        System.out.println(Iva);
        Double PrecioFinal = ProductoSinIva + Iva;

        System.out.println("El precio de: " + Producto + " es: $" + PrecioFinal + " y se vendieron: " + cantidadproducto);
        sc.close();
    }
}

package nuevaclase;
//Reto2

public class App {
    public static void main(String[] args) {
        Dispositivo dispositivos[] = new Dispositivo[5];
        dispositivos[0] = new Dispositivo(200.0, 3 , 'C' );
        dispositivos[1] = new Tablet(150.0,2);
        dispositivos[2] = new Portatil(500.0,3,'E',250);
        dispositivos[0] = new Tablet();
        dispositivos[0] = new Dispositivo(600.0,3,'D');
        PrecioTotal Solucion1 = new PrecioTotal(dispositivos);
        Solucion1.mostrarTotales();
    }
}

/*public class PrecioTotal {

    
}

public class Dispositivo(){
    
}

public class Tablet extends Dispositivo{

}

public class Portatil extends Dispositivo{

}*/ 
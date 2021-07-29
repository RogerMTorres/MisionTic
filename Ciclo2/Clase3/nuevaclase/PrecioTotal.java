package nuevaclase;
public class PrecioTotal {
    private Double totalDispositivos;
    private Double totalPortatiles;
    private Double totalTablets;
    private Dispositivo[] listadDispositivos;
    //  Constructores 
    PrecioTotal(Dispositivo[] pDispositivos){
        totalDispositivos =0.0;
        totalPortatiles =0.0;
        totalTablets=0.0; 
        
    }
    //Metodos  
    public void mostrarTotales(){

        for (int i = 0; i < listadDispositivos.length; i++) {
            if (listadDispositivos[i].getClass().getName().contains("Portatil"))
                totalPortatiles += listadDispositivos[i].calcularPrecio();
            else if (listadDispositivos[i].getClass().getName().contains("Tablet"))
                totalTablets += listadDispositivos[i].calcularPrecio();
            else
                totalDispositivos += listadDispositivos[i].calcularPrecio();
        }
        System.out.println("La suma del precio de los dispositivos es de " +totalDispositivos);

        System.out.println("La suma del precio de los Computatores portátiles es de "+ totalPortatiles);

        System.out.println("La suma del precio de los Computatores portátiles es de "+ totalTablets);
    }
}


public class PrecioTotal {
    private Double totalDispositivos=0.0;
    private Double totalPortatiles =0.0;
    private Double totalTablets =0.0;
    //  Constructores 
    PrecioTotal(Dispositivo[] pDispositivos){

    }
    //Metodos  
    public void mostrarTotales(){
        //calculo Totales

        System.out.println("La suma del precio de los dispositivos es de " +totalDispositivos);

        System.out.println("La suma del precio de los Computatores portátiles es de "+ totalPortatiles);

        System.out.println("La suma del precio de los Computatores portátiles es de "+ totalTablets);
    }
}

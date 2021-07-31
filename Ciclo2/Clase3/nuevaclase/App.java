package nuevaclase;
//Reto2

public class App {
    public static void main(String[] args) {
        Dispositivo dispositivos[] = new Dispositivo[5];
        dispositivos[0] = new Dispositivo(200.0, 3 , 'C' );
        dispositivos[1] = new Tablet(150.0,2);
        dispositivos[2] = new Portatil(500.0,3,'E',250);
        dispositivos[3] = new Tablet();
        dispositivos[4] = new Dispositivo(600.0,3,'D');
        PrecioTotal Solucion1 = new PrecioTotal(dispositivos);
        Solucion1.mostrarTotales();
    }
}

class PrecioTotal {
    private Double totalDispositivos;
    private Double totalPortatiles;
    private Double totalTablets;
    private Dispositivo[] listadDispositivos;
    //  Constructores 
    PrecioTotal(Dispositivo[] pDispositivos){
        totalDispositivos = 0d;
        totalPortatiles = 0d;
        totalTablets = 0d;
        listadDispositivos =pDispositivos;
        for (int i = 0; i < pDispositivos.length; i++){
            if (pDispositivos[i] instanceof Portatil){
                totalPortatiles += pDispositivos[i].calcularPrecio();
            } else if (pDispositivos[i] instanceof Tablet){
                totalTablets += pDispositivos[i].calcularPrecio();
            } 
            totalDispositivos += pDispositivos[i].calcularPrecio();
        }
    }
    
    //Metodos  
    public void mostrarTotales(){

        
        System.out.println("La suma del precio de los Dispositivos es de " +totalDispositivos);

        System.out.println("La suma del precio de los Computadores portatiles es de "+ totalPortatiles);

        System.out.println("La suma del precio de las Tablets es de " + totalTablets);
    }
    
}

class Dispositivo {
    //constantes y atributos
    private Double precioBase;
    private Integer Peso = 0;
    private char consumoW = 'F';
    //private Double adiccion = 0.0;
    private final char CONSUMO_W_BASE = 'F';
    private final Double PRECIO_BASE = 100.0;
    private final Integer PESO_BASE =1;


    //Constructores
    public Dispositivo(){
    this.consumoW =CONSUMO_W_BASE;
    this.precioBase = PRECIO_BASE;
    this.Peso =PESO_BASE;
    }
    
    public Dispositivo(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.Peso=peso;
        this.consumoW = CONSUMO_W_BASE;
    }
    
    public Dispositivo(Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.Peso=peso;
        this.consumoW = consumoW;
    }

    //metodos
    public void comprobarconsumoW(char consumoW){

    } 
    public Double calcularPrecio(){
        double adicion =0d;
        switch (consumoW) {
            case 'A': adicion += 100;
                
                break;
            case 'B': adicion += 80;
                
                break;
            case 'C': adicion += 60;
                
                break;
            case 'D': adicion += 50;
                
                break;
            case 'E': adicion += 30;
                
                break;
            case 'F': adicion += 10;
                
                break;
            default:
                break;
        }
        if (Peso > 1 && Peso <= 2) {
            adicion += 10;
        }
        else if (Peso > 2 && Peso <= 3) {
            adicion +=50;
        }
        else if (Peso > 3 && Peso <=4) {
            adicion +=80;              
        }
        else if (Peso > 4) {
            adicion += 100;              
        }
        return precioBase + adicion;
    }
}

class Tablet extends Dispositivo{
//Constantes y atributos 
    private final Integer MEMORIA_RAM_BASE = 1;
    private Integer memoriaRam;
    //Constructor
    public Tablet(){
    super();
    this.memoriaRam = MEMORIA_RAM_BASE;
    }

    public Tablet(Double precioBase, Integer peso){
        super(precioBase,peso);
        this.memoriaRam = MEMORIA_RAM_BASE;
    }
    public Tablet(Double precioBase, Integer peso,char consumoW, Integer memoriaRam){
        super(precioBase,peso,consumoW);
        this.memoriaRam = memoriaRam;
    }
    //metodos
    public Double calcularPrecio(){
        double adicion =0d;
        if (memoriaRam > 1 && memoriaRam <= 2) {
            adicion += 5;
        }
        if (memoriaRam > 2 && memoriaRam <= 4) {
            adicion += 25;
        }
        if (memoriaRam > 4) {
            adicion += 50;              
        }
        
        return super.calcularPrecio() + adicion;
    }
}

class Portatil extends Dispositivo{
 //Constantes y atributos 
 private final Integer DISCO_DURO_BASE = 250;
 private Integer discoDuro;

 //Constructor
 public Portatil(){
     super();
   this.discoDuro =DISCO_DURO_BASE;
 }

 public Portatil(Double precioBase, Integer peso){
     super(precioBase,peso);
     this.discoDuro =DISCO_DURO_BASE;
 }
 public Portatil(Double precioBase, Integer peso,char consumoW, Integer discoDuro){
    super(precioBase,peso,consumoW);
    this.discoDuro =discoDuro;
 }

 public Double calcularPrecio(){
     double adicion =0d;
     if (discoDuro > 250 && discoDuro <= 500) {
         adicion +=10;
     }
     else if (discoDuro > 500 && discoDuro <= 1000) {
         adicion += 50;
     }          
     else if (discoDuro > 1000) {
         adicion += 100;              
     }
     return super.calcularPrecio() + adicion;
    }
}

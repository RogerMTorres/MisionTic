package nuevaclase;
public class Dispositivo {
    //constantes y atributos
    Double precioBase;
    Integer Peso;
    char Consumow;
    Double adiccion;
    char CONSUMO_W_BASE;
    Double PRECIO_BASE;
    Integer PESO_BASE;


    //Constructores
    public Dispositivo(){
    CONSUMO_W_BASE ='F';
    PRECIO_BASE = 100.0;
    PESO_BASE = 1;
    }
    
    public Dispositivo(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        comprobarPeso(peso);
    }
    
    public Dispositivo(Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        comprobarPeso(peso);
        comprobarconsumoW(consumoW);
    }

    //metodos
    public void comprobarconsumoW(char consumoW){
        
        if (consumoW == 'A') {
            adiccion = adiccion+100;
        }
        if (consumoW == 'B') { 
            adiccion = adiccion + 80;
        }
        if (consumoW == 'C') { 
            adiccion = adiccion + 60;
        }
        if (consumoW == 'D') { 
            adiccion = adiccion + 50;
        } 
        if (consumoW == 'E') { 
            adiccion = adiccion + 30;
        }  
        if (consumoW == 'F') { 
            adiccion = adiccion + 10;
        }
        //this.consumoW=consumoW;
        else{
            //this.consumoW=CONSUMO_W;
        }
    } 
    public void comprobarPeso(Integer Peso){
        
        if (Peso > 1 && Peso <= 2) {
            adiccion = adiccion+10;
        }
        if (Peso > 2 && Peso <= 3) {
            adiccion = adiccion+50;
        }
        if (Peso > 3 && Peso <=4) {
            adiccion = adiccion+80;              
        }
        if (Peso > 4) {
            adiccion = adiccion+100;              
        }
    } 

    public Double calcularPrecio(){
        Double resultado = precioBase + adiccion;
        return resultado;
    }
}

public class Dispositivo {
    //constantes y atributos
    Double precioBase;
    Integer Peso;
    char Consumow;
    int adiccion =0;
    char CONSUMO_W_BASE ='F';
    Double PRECIO_BASE = 100.0;
    Integer PESO_BASE = 1;


    //Constructores
    public Dispositivo(){

    }
    
    public Dispositivo(Double precioBase, Integer peso){
        //codigo
    }
    
    public Dispositivo(Double precioBase, Integer peso, char consumoW){
        //codigo
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
        
        if (Peso >= 0 && Peso < 1) {
            adiccion = adiccion+10;
        }
        if (Peso > 1 && Peso < 2) {
            adiccion = adiccion+50;
        }
        if (Peso >= 2 && Peso < 3) {
            adiccion = adiccion+80;
        }
        if (Peso > 3) {
            adiccion = adiccion+100;              
        }
        
    } 

  /*  public Double calcularPrecio(){
       

        //return precioBase + adicion:
    }
    */
}

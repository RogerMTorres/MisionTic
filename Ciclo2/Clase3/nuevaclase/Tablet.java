package nuevaclase;
public class Tablet extends Dispositivo {
     //Constantes y atributos 
    Integer MEMORIA_RAM_BASE;
    Integer memoriaRam;
    //Constructor
    public Tablet(){
    MEMORIA_RAM_BASE = 1;
    }

    public Tablet(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        comprobarPeso(peso);
    }
    public Tablet(Double precioBase, Integer peso,char consumoW, Integer memoriaRam){
        this.precioBase = precioBase;
        comprobarPeso(peso);
        comprobarconsumoW(consumoW);
        CalcularMemoriaRam(memoriaRam);
    }
    //metodos
    public void CalcularMemoriaRam(Integer memoriaRam){
        
        if (memoriaRam > 1 && memoriaRam <= 2) {
            adiccion = adiccion+5;
        }
        if (memoriaRam > 2 && memoriaRam <= 4) {
            adiccion = adiccion+25;
        }
        if (memoriaRam > 4) {
            adiccion = adiccion+50;              
        }
    } 
    public Double calcularPrecio(){
        Double resultado = precioBase + adiccion;
        return resultado;
    }
}

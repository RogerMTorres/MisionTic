package nuevaclase;
public class Portatil extends Dispositivo{
     //Constantes y atributos 
    Integer DISCO_DURO_BASE;
    Integer discoDuro;

    //Constructor
    public Portatil(){
        DISCO_DURO_BASE =250;
    }

    public Portatil(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        comprobarPeso(peso);
    }
    public Portatil(Double precioBase, Integer peso,char consumoW, Integer discoDuro){
        this.precioBase = precioBase;
        comprobarPeso(peso);
        comprobarconsumoW(consumoW);
        calcularDiscoDuro(discoDuro);
    }
    //metodos
    public void calcularDiscoDuro(Integer discoDuro){
        
        if (discoDuro > 250 && discoDuro <= 500) {
            adiccion = adiccion+10;
        }
        if (discoDuro > 500 && discoDuro <= 1000) {
            adiccion = adiccion+50;
        }          
        if (discoDuro > 1000) {
            adiccion = adiccion+100;              
        }
    } 
    public Double calcularPrecio(){
        Double resultado = precioBase + adiccion;
        return resultado;
    }
    
}

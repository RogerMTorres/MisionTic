package nuevaclase;

// inicio de la clase humano
public class humano {
// atributos de la clase
    String nombre; // al declarar estos atributos sin la palabra "private" nos permite cambiar o conocer su valor desde fuera de la clase 
    float estatura; // estos atributos de la clase  son variables a las que podemos acceder desde cualquier lugar de la clase porque estan declaradas fuera de todos los metodos 
    String genero;
    float peso;
    int edad;
    private String color; // este atributo tiene la palabra clave  "private" esto hace que no podamos cambiar o conocer su valor desde fuera de la clase 

    // constructor sin parametros, se puede ver que el nombre de este metodo es igual al nombre de la clase 
    public humano(){
        // los metodos constructores comunmente se usan para dar un valor inicial a los atributos de la clase 
        nombre="nn";
        estatura = 1.5f;
        genero = "hombre";
        peso = 30;
        edad = 18;
        color = "negro";
    }
    // constructor  con un parametro entero, este metodo tiene  el mismo nombre de la clase, por eso es un constructor pero recibe un parametro 
    public humano(int edad){
        nombre="frank";
        estatura = 1.6f;
        genero = "hombre";
        peso = 70;
        this.edad = edad;
        color = "blanco";
    }


    // el siguiente es un metodo publico lo que permite que lo llamemos fuera de la clase 
    // como convencion nombramos este metodo "setxxxx" pues es un metodo que nos permite asignar un valor a un atributo  privado 
    public void setcolor(String color){
        this.color =color;
    }

    // el siguiente es un metodo publico que usamos para obtener el valor del atributo privado "color"
    public String getcolor(){
        return color;
    }
}

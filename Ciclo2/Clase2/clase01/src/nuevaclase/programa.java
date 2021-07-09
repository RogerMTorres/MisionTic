package nuevaclase; // esta linea de codigo le indica a java que este archivo pertenece al paquete  "nueva clase"

public class programa {// aqui estamos declarando una clase, el nombre de la clase debe ser exactamente igual al nombre del archivo sin  el .java

    public static void main(String[] args) {// el metodo main es el punto de inicio de ejecucion de un programa, no todas las clases lo tienen
     
        humano persona1 = new humano(); // estamos instanciando o creando una instancia u objeto de la clase  humano llamando a su constructor sin parametros
        humano persona2 = new humano(41);// estamos instanciando o creando una instancia u objeto de la clase  humano llamando a su constructor con un parametro entero (sobrecarga de metodos )
        persona1.edad=30; // estamos modificando el atributo edad del objeto persona1, podemos hacerlo porque este atributo lo declaramos como publico

        System.out.println(persona1.estatura);
        System.out.println(persona1.edad);
        persona1.setcolor("blanco");// estamos modificando el atributo color del objeto persona 1, usando el metodo "setcolor", no se puede cambiar directamente porque este atributo es privado

        

        System.out.println(persona1.getcolor());// con el metodo "getcolor"  obtenemos el valor del atributo color para imprimirlo, no podemos hacer directamente porque este atributo es privado 

        System.out.println(persona2.estatura);// obtenemos al valor del atributo "estatura" directamente  pues es  publico

        empleado  trabajador1 = new empleado(5000000,"programador");// instanciamos la clase empleado que es hija de la clase humano y le enviamos los parametros que nos pide su metodo constructor

        System.out.println("estatura del trabajador 1 " + trabajador1.estatura);
        System.out.println(trabajador1.getcolor());

    }
    
}

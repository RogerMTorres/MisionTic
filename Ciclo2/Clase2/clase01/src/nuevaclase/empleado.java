package nuevaclase;
/* esta clase llamada empleado  hereda de la clase humano 
gracias a la palabra clave "extends" en la declaracion de la clase
al ser una clase hija hereda todos los atributos y metodos de la clase padre 
*/
public class empleado extends humano {
int sueldo;  // en esta linea estamos agregando un atributo nuevo que es solo de esta clase
String cargo;


// a continuacion declaramos el constructor de la clase que pide dos parametros 
public empleado(int sueldo , String cargo){  
    super(); // en esta linea  estamos llamando al constructor  de la clase padre (clase humano) 
             // para inicializar los atributos de la clase padre
    this.sueldo = sueldo; // asignamos  a la variable sueldo de la clase (this.sueldo) el valor que me envian en la llamada 
    this.cargo = cargo; 

}

    
}

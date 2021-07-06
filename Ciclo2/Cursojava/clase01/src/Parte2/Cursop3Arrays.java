package clase01.src.Parte2;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.DefaultListModel;

public class Cursop3Arrays {
    /* 
        -> esta es una forma de crear arreglos en java:
       ↓↓↓↓↓↓↓↓↓↓ Esta seria una lista ↓↓↓↓↓↓↓↓↓↓
        */
/*→→→→→ */ private static List<String> Lista = new ArrayList<>(); //←←←←←←←←←
    public static void main(String[] args) {
        
        String Nombre = "";
        Lista.add(Nombre);
        /* 
        -> esta es una forma de crear arreglos en java:

        String[] arreglo = new String[10];
        arreglo[0] = "Lucas";
        arreglo[1] = "Marcelo";
        arreglo[2] = "Pepe";
        */
    }
    /* Se creo una funcion para actualizar la lista que recibe los datos del proyecto
    de Netbeans
    private void Actualizarlista(){

        DefaultListModel datos = new  DefaultListModel();
        
        for (int i = 0; i < Lista.size(); i++) {
            String nombre = Lista.get(i);
            datos.addElement(nombre);
            
        }
        
    }*/
}

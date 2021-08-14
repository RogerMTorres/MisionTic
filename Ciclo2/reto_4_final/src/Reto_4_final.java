/*
 * Pueda usar esta plantilla para la carga del reto a iMaster
 * Copie las clases de los paquetes Modelo, Vista, Controlador y Util
 * No incluya los import de los archivos .java solo las clases
 */
// Importaciones necesarias en iMaster
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

// Util (No modificar)
class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

// Remplace en adelante por las clases de sus archivos .java

// Vista

class VistaRequerimientosReto4 {
    
    public static final Controlador control = new Controlador ();
    
    public static void requerimiento1 (){
        System.out.println("*** Lideres por Salario ***");

        try {
            ArrayList<Liderporsalario> lista = control.Requerimiento_1();
            for (Liderporsalario lider : lista) {
                System.out.printf("El Lider %s %s con Id %d Tiene un salario de %d %n", 
                lider.getNombre(),
                lider.getApellido(),
                lider.getId_lider(),
                lider.getSalario()
                );
            }
        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        } 
    }

    public static void requerimiento2 (){
        
        System.out.println("*** Proyectos por Tipo ***");

        try {
            ArrayList<Proyectoportipo> listap = control.Requerimiento_2();
            for (Proyectoportipo proyecto : listap) {
                System.out.printf("El proyecto con ID %d de la constructora: %s de la ciudad %s, tiene un estrato asignado igual a %d %n",
                proyecto.getId_proyecto(),
                proyecto.getConstructora(),
                proyecto.getCiudad(),
                proyecto.getEstrato()
                );
            }
        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        }
    }


    public static void requerimiento3 (){
        
        System.out.println("*** Lideres por Nombre ***"); 

        try {
            ArrayList<LideresporNombre> listaN = control.Requerimiento_3();
            for (LideresporNombre lideresporN : listaN) {
            System.out.printf("El Lider con Id %d se llama %s %s %n",
            lideresporN.getId_lider(),
            lideresporN.getNombre(),
            lideresporN.getApellido()
            );
            }
        
        }   catch (Exception e) {
        System.err.println("Se ha generado el siguiente" + e.getMessage());
    }
   } 
}

// Controlador

class Controlador {
   
    private final Liderporsalario_dao _lidersalario; 
    private final Proyectoportipo_dao _proyectotipo;
    private final LideresporNombre_dao _lideresnombre;


    public Controlador() {
        _lidersalario = new Liderporsalario_dao();
        _proyectotipo = new Proyectoportipo_dao();
        _lideresnombre = new LideresporNombre_dao();
    }

    public ArrayList<Liderporsalario> Requerimiento_1 () throws SQLException {
        return _lidersalario.requerimiento1();
    }

    public ArrayList <Proyectoportipo> Requerimiento_2 () throws SQLException {
        return _proyectotipo.requermiento2();
    }    
    public ArrayList <LideresporNombre> Requerimiento_3 () throws SQLException {
        return _lideresnombre.requerimiento3();
    }
}

// Modelo
// VO

class Liderporsalario {
    private String nombre;
    private String apellido;
    private Integer id_lider;
    private Integer salario;

    // public Liderporsalario() {
    // }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getId_lider() {
        return id_lider;
    }
    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }
    public Integer getSalario() {
        return salario;
    }
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}

class Proyectoportipo {
    private Integer id_proyecto;
    private String constructora;
    private String ciudad;
    private Integer estrato;

    public Integer getId_proyecto() {
        return id_proyecto;
    }
    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    public void setCiudad(int int1) {
    }
}


class LideresporNombre {
    private String nombre;
    private String apellido;
    private Integer id_lider;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getId_lider() {
        return id_lider;
    }
    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }
}

// DAO
class Liderporsalario_dao {

    public ArrayList<Liderporsalario> requerimiento1 () throws SQLException {

    ArrayList<Liderporsalario> respuesta = new ArrayList<Liderporsalario>();
    Connection conect = JDBCUtilities.getConnection();

    try {
        String consulta ="SELECT id_Lider, Nombre, Primer_Apellido, salario " + 
                         "FROM Lider WHERE salario <= 500000 ORDER BY salario ";

        PreparedStatement statement = conect.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();
        
        while (resultado.next()) {
            
            Liderporsalario salario = new Liderporsalario();

            salario.setNombre(resultado.getString("Nombre"));
            salario.setId_lider(resultado.getInt("id_Lider"));
            salario.setSalario(resultado.getInt("salario"));
            salario.setApellido(resultado.getString("Primer_Apellido"));

            respuesta.add(salario);

        }
        resultado.close();
        statement.close();
        
        
    } catch (SQLException e) {
            System.out.println("Se ha generado el siguiente error: " + e);
    } finally {
        if (conect != null) {
            conect.close();
        }
    }
    return respuesta;
 }
}

class Proyectoportipo_dao {
    
    public ArrayList<Proyectoportipo> requermiento2 () throws SQLException {

        ArrayList<Proyectoportipo> respuesta = new ArrayList<Proyectoportipo>();
        Connection conect = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_Proyecto , Constructora , Ciudad, t.Estrato "+
                              "FROM Proyecto p  join Tipo t ON p.ID_Tipo = t.ID_Tipo "+
                              "where p.Ciudad LIKE 'Cartagena' "+
                              "ORDER BY t.Estrato ASC ";

            PreparedStatement statement = conect.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                
                Proyectoportipo proyecto = new Proyectoportipo();

                proyecto.setId_proyecto(resultado.getInt("ID_Proyecto"));
                proyecto.setConstructora(resultado.getString("Constructora"));
                proyecto.setCiudad(resultado.getString("Ciudad"));
                proyecto.setEstrato(resultado.getInt("Estrato"));
               
                respuesta.add(proyecto);
            }
            resultado.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Se ha generado el siguiente error: " + e);
        } finally {
            if (conect != null) {
                conect.close();
            }
        }
        return respuesta;
    }
}


class LideresporNombre_dao {
    
    public ArrayList<LideresporNombre> requerimiento3 () throws SQLException {

        ArrayList<LideresporNombre> respuesta = new ArrayList<LideresporNombre>();
        Connection conect = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido "+ 
                              "from Lider l "+
                              "where Primer_Apellido LIKE '%z' "+
                              "ORDER BY Nombre ASC ";

            PreparedStatement statement = conect.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                LideresporNombre lideres = new LideresporNombre();

                lideres.setNombre(resultado.getString("Nombre"));
                lideres.setId_lider(resultado.getInt("ID_Lider"));
                lideres.setApellido(resultado.getString("Primer_Apellido"));

                respuesta.add(lideres);
                
            }
            resultado.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Se ha generado el siguiente error: " + e);
        } finally {
            if (conect != null) {
                conect.close();
            }
        }
        return respuesta;
    }
}

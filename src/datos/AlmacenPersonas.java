package datos;
import logica.Personas;
import java.util.ArrayList;
/**
 *
 * @author fzupi
 */
public class AlmacenPersonas {
     private ArrayList<Personas> listaPersonas;

    public AlmacenPersonas() {
        listaPersonas = new ArrayList<>();
    }
    // CREATE   (Agregar persona si no existe la cédula)
    public boolean agregarPersona(Personas p) {
        if (p == null || p.getCedula().isEmpty()) return false;
        if (buscarPersona(p.getCedula()) != null) return false;
        listaPersonas.add(p);
        return true;
    }
    //READ  (Buscar por cédula)
    public Personas buscarPersona(String cedula) {
        for (Personas p : listaPersonas) {
            if (p.getCedula().equalsIgnoreCase(cedula)) {
                return p;
            }
        }
        return null;
    }
    //UPDATE       (Modificar nombre, teléfono, fecha, etc.)
    public boolean modificarPersona(String cedula, String nuevoNombre, String nuevoTelefono) {
        Personas p = buscarPersona(cedula);
        if (p != null) {
            p.setNombre(nuevoNombre);
            p.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }
    // DELETE  elimina persona  por cédula
    public boolean eliminarPersona(String cedula) {
        Personas p = buscarPersona(cedula);
        if (p != null) {
            listaPersonas.remove(p);
            return true;
        }
        return false;
    }
    // Muestra  todas las personas
    public ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }
}
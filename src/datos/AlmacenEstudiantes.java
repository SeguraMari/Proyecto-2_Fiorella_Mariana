
package datos;
import logica.Estudiantes;
import java.util.ArrayList;
/**
 *
 * @author fzupi
 */
public class AlmacenEstudiantes {
        private ArrayList<Estudiantes > listaEstudiantes = new ArrayList<>();         // ARRAY
        
    public void agregar(Estudiantes estudiante) {    //CREATE   ( agrega   )
        listaEstudiantes.add(estudiante);
    }
    public ArrayList<Estudiantes > getLista() {     // READ ( Lee )
    return listaEstudiantes;
    }
 public boolean actualizarEstudiante(String cedula, Estudiantes actualizado) {     // UPDATE ( Actualiza  )
    for (int i = 0; i < listaEstudiantes.size(); i++) {
        if (listaEstudiantes.get(i).getCedula().equals(cedula)) {
            listaEstudiantes.set(i, actualizado);
            return true;
        }
    }
    return false;
}  
public boolean eliminarEstudiante(String cedula) {  //DELETE   (   Elimina   )
    for (Estudiantes e : listaEstudiantes) {
        if (e.getCedula().equals(cedula)) {
            listaEstudiantes.remove(e);
            return true;
        }
    }
    return false;
}
}
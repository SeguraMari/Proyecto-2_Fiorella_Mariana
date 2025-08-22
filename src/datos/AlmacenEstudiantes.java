
package datos;
import logica.Estudiantes;
import java.util.ArrayList;
/**
 *
 * @author fzupi
 */

public class AlmacenEstudiantes {
     private ArrayList<Estudiantes > listaEstudiantes = new ArrayList<>();   
     
        
     //Agregar un estudiante no existe otro con el mismo carnet o ced
     public boolean agregar(Estudiantes estudiante) {
        if (estudiante == null) return false;
        for (Estudiantes e : listaEstudiantes) {
            if (e.getCedula().equals(estudiante.getCedula()) || 
                e.getCarnet().equals(estudiante.getCarnet())) {
                return false; // duplicado
            }
        }
        listaEstudiantes.add(estudiante);
        return true;
    }
     
    /*
     Devuelve la lista de estudianes
     */
    public ArrayList<Estudiantes > getLista() { 
    return listaEstudiantes;
    }
    
    /*
     *Busca el estudiante por cedula
    */
    public Estudiantes buscarPorCedula(String Cedula){
        for (Estudiantes e : listaEstudiantes) {
            if (e.getCedula().equals(Cedula)) {
                return e;
            }
        }
        return null;
    }
    
    /*
      *Busca el estudiante por carnet
    */
    public Estudiantes buscarPorCarnet(String Carnet){
        for (Estudiantes e: listaEstudiantes){
            if (e.getCarnet().equals(Carnet)) {
                return e;
            }
        }
        return null;
    }
    
    
    /*
    Actualiza los datos del estudiante segun cedula existente
    */
    public boolean actualizarEstudiante(String cedula, Estudiantes actualizado) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCedula().equals(cedula)) {
                listaEstudiantes.set(i, actualizado);
                return true;
            }
        }
        return false;
    }
    
    /*
     * Elimina un estudiante por su cedula
    */
    
public boolean eliminarEstudiante(String cedula) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCedula().equals(cedula)) {
                listaEstudiantes.remove(i);
                return true;
            }
        }
        return false;
    }
}
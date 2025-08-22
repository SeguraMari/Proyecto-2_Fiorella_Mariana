package datos;

import java.util.ArrayList;
import logica.BeneficiosEstudiantes;

/**
 * Clase AlmacenBeneficiosEstudiantes.
 * Maneja la lista de relaciones entre Estudiantes y Beneficios.
 */
public class AlmacenBeneficiosEstudiantes {
    private ArrayList<BeneficiosEstudiantes> listaAsignaciones;

    public AlmacenBeneficiosEstudiantes() {
        listaAsignaciones = new ArrayList<>();
    }

    // CREATE (Asignar beneficio a estudiante)
    public boolean asignarBeneficio(BeneficiosEstudiantes be) {
        if (be == null) return false;

        // Validar que no exista la misma combinación cedula-beneficio
        for (BeneficiosEstudiantes asignacion : listaAsignaciones) {
            if (asignacion.getCedula().equals(be.getCedula()) &&
                asignacion.getIdBeneficio() == be.getIdBeneficio()) {
                return false; // ya existe
            }
        }
        listaAsignaciones.add(be);
        return true;
    }

    // READ (Buscar todas las asignaciones de un estudiante)
    public ArrayList<BeneficiosEstudiantes> buscarPorCedula(String cedula) {
        ArrayList<BeneficiosEstudiantes> resultados = new ArrayList<>();
        for (BeneficiosEstudiantes be : listaAsignaciones) {
            if (be.getCedula().equals(cedula)) {
                resultados.add(be);
            }
        }
        return resultados;
    }

    // DELETE (Eliminar asignación específica)
    public boolean eliminarAsignacion(String cedula, int idBeneficio) {
        for (BeneficiosEstudiantes be : listaAsignaciones) {
            if (be.getCedula().equals(cedula) && be.getIdBeneficio() == idBeneficio) {
                listaAsignaciones.remove(be);
                return true;
            }
        }
        return false;
    }

    // Obtener todas las asignaciones
    public ArrayList<BeneficiosEstudiantes> getListaAsignaciones() {
        return listaAsignaciones;
    }
}

package logica;

/**
 * Clase BeneficiosEstudiantes.
 * Representa la relación entre un Estudiante y un Beneficio asignado.
 * Funciona como tabla intermedia (muchos a muchos).
 */
public class BeneficiosEstudiantes {
    private String cedula;      // Cédula del estudiante
    private int idBeneficio;    // Id del beneficio asignado

    // Constructor completo
    public BeneficiosEstudiantes(String cedula, int idBeneficio) {
        this.cedula = cedula;
        this.idBeneficio = idBeneficio;
    }

    // Constructor vacío
    public BeneficiosEstudiantes() {
        this.cedula = "";
        this.idBeneficio = 0;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(int idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    @Override
    public String toString() {
        return "Estudiante (cédula): " + cedula + 
               " | Beneficio ID: " + idBeneficio;
    }
}

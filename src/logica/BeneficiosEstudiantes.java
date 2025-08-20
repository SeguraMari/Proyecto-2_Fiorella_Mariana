
package logica;
/**
 *
 * @author fzupi
 */
public class BeneficiosEstudiantes {
    private String cedula;
    private String idBeneficio;

    public BeneficiosEstudiantes(String cedula, String idBeneficio) {
        this.cedula = cedula;
        this.idBeneficio = idBeneficio;
    }   
     public BeneficiosEstudiantes() {
        this.cedula = "";
        this.idBeneficio = "";     
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getIdBeneficio() {
        return idBeneficio; 
    }
    public void setIdBeneficio(String idBeneficio) {
        this.idBeneficio = idBeneficio; 
    }
    
}



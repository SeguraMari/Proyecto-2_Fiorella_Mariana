package logica;

public class Beneficios {
    private String idBeneficio;
    private String nomBeneficio;
    private String descripcion;
    private double montoBeneficio;

    public Beneficios(String idBeneficio, String nomBeneficio, String descripcion, double montoBeneficio) {
        this.idBeneficio = idBeneficio;
        this.nomBeneficio = nomBeneficio;
        this.descripcion = descripcion;
        this.montoBeneficio = montoBeneficio;
    }
        public Beneficios() {
        this.idBeneficio = "";
        this.nomBeneficio = "";
        this.descripcion = "";
        this.montoBeneficio = 0;
        }
    public String getIdBeneficio() {
        return idBeneficio; 
    }
    public void setIdBeneficio(String idBeneficio) { 
        this.idBeneficio = idBeneficio;
    }
    public String getNomBeneficio() {
        return nomBeneficio;
    }
    public void setNomBeneficio(String nomBeneficio) {
        this.nomBeneficio = nomBeneficio; 
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; 
    }
    public double getMontoBeneficio(){
        return montoBeneficio;
    }
    public void setMontoBeneficio(double montoBeneficio) {
        this.montoBeneficio = montoBeneficio; 
    }
      @Override
    public String toString() { return idBeneficio + " - " + nomBeneficio; 
    }
}


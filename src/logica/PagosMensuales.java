package logica;
import java.util.Calendar;
import java.util.Locale;

public class PagosMensuales {
 
    private String idPago;
    private Calendar fechCreacion;
    private String mes;
    private Calendar fechPago;
    private String estudiante;
    private double totalBeneficios;
    private double deducSeguro;
    private double deducRenta;
    private double pagoNeto;

    public PagosMensuales(String idPago, Calendar fechCreacion, String mes, Calendar fechPago, String estudiante, double totalBeneficios, double deducSeguro, double deducRenta, double pagoNeto) {
      
        this.idPago = idPago;
        this.fechCreacion = fechCreacion;
        this.mes = mes;
        this.fechPago = fechPago;
        this.estudiante = estudiante;
        this.totalBeneficios = totalBeneficios;
        this.deducSeguro = deducSeguro;
        this.deducRenta = deducRenta;
        this.pagoNeto = pagoNeto;
        recalcular (); //   se declara para ppoder usar en la operacion de deduccion
    }
     public final void recalcular() {          // Operación que permite hacer el conteo de cada gestion  o deducciones con elprecio neto
        
         this.deducSeguro = totalBeneficios * 0.10; // 10%
        this.deducRenta  = totalBeneficios * 0.05; // 5%
        this.pagoNeto    = totalBeneficios - (deducSeguro + deducRenta);
     }
  public PagosMensuales() {
      
      this.idPago = "";
        this.fechCreacion = null;
        this.mes = "";
        this.fechPago = null;
        this.estudiante= "";
        this.totalBeneficios = 0;
        this.deducSeguro = 0;
        this.deducRenta = 0;
        this.pagoNeto = 0;
  }
    public String getIdPago() {
        return idPago;
    }
    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
    public Calendar getFechCreacion() {
        return fechCreacion;
    }
    public void setFechCreacion(Calendar fechCreacion) {
        this.fechCreacion = fechCreacion;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public Calendar getFechPago() {
        return fechPago;
    }
    public void setFechPago(Calendar fechPago) {
        this.fechPago = fechPago;
    }
    public String getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
    public double getTotalBeneficios() {
        return totalBeneficios;
    }
    public void setTotalBeneficios(double totalBeneficios) {
        this.totalBeneficios = totalBeneficios;
    }
    public double getDeducSeguro() {
        return deducSeguro;
    }
    public void setDeducSeguro(double deducSeguro) {
        this.deducSeguro = deducSeguro;
    }
    public double getDeducRenta() {
        return deducRenta;
    }
    public void setDeducRenta(double deducRenta) {
        this.deducRenta = deducRenta;
    }
    public double getPagoNeto() {
        return pagoNeto;
    }
    public void setPagoNeto(double pagoNeto) {
        this.pagoNeto = pagoNeto;
    }
     @Override
    public String toString() {      // Podemos observar 
        return "Pago#" + idPago + " - " + mes + " - " + estudiante + " - Neto: " +
                String.format(Locale.US, "%,.2f", pagoNeto);
}
}
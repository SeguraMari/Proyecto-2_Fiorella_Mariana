package datos;
import logica.PagosMensuales;
import java.util.ArrayList;
/**
 *
 * @author fzupi
 */
public class AlmacenPagosMensuales {
   private ArrayList<PagosMensuales> listaPagos = new ArrayList<>();
   
  // CREATE  (Crear)
    public boolean añadirPago(PagosMensuales nuevoPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago().equals(nuevoPago.getIdPago())) {
                return false; // Si el ID  esta duplicado
            }
        }
        listaPagos.add(nuevoPago);
        return true;
    }
    // READ (Buscar un pago por ID)
    public PagosMensuales buscarPago(int idPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago().equals(idPago)) {
                return pago;
            }
        }
        return null;
    }
    
    // UPDATE (Actualizar pago)
    public boolean actualizarPago(int idPago, PagosMensuales pagoActualizado) {
        for (int i = 0; i < listaPagos.size(); i++) {
            if (listaPagos.get(i).getIdPago().equals(idPago)) {
                listaPagos.set(i, pagoActualizado);
                return true;
            }
        }
        return false;
    }
    
    
    // DELETE (Eliminar un pago)
    public boolean eliminarPago(int idPago) {
        for (int i = 0; i < listaPagos.size(); i++){
            if (listaPagos.get(i).getIdPago().equals(idPago)){
                listaPagos.remove(i);
                return true;
                
            }
        }
        return false;
    }
    //Listar todos los pagos mensuales
    public ArrayList<PagosMensuales> getListaPagos() {
        return listaPagos;
    }
}


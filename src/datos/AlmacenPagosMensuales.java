package datos;
import logica.PagosMensuales;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author fzupi
 */
public class AlmacenPagosMensuales {
   private ArrayList<PagosMensuales> listaPagos = new ArrayList<>();
   
  // CREATE  (Crear)
    public boolean agregarPago(PagosMensuales nuevoPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago().equals(nuevoPago.getIdPago())) {
                return false; // Si el ID  esta duplicado
            }
        }
        listaPagos.add(nuevoPago);
        return true;
    }
    // READ    ( Leer )
    public PagosMensuales buscarPago(String idPago) {
        for (PagosMensuales pago : listaPagos) {
            if (pago.getIdPago().equals(idPago)) {
                return pago;
            }
        }
        return null;
    }
    // UPDATE     (  Actualizar  )
    public boolean actualizarPago(String idPago, PagosMensuales pagoActualizado) {
        for (int i = 0; i < listaPagos.size(); i++) {
            if (listaPagos.get(i).getIdPago().equals(idPago)) {
                listaPagos.set(i, pagoActualizado);
                return true;
            }
        }
        return false;
    }
    // DELETE      (   Eliminar )
    public boolean eliminarPago(String idPago) {
        return listaPagos.removeIf(pago -> pago.getIdPago().equals(idPago));
    }
    //Listar todos los pagos mensuales
    public ArrayList<PagosMensuales> obtenerTodos() {
        return listaPagos;
    }
}


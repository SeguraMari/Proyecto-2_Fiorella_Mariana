package datos;
import java.util.ArrayList;
import logica.Beneficios;
/**
 *
 * @author fzupi
 */
public class AlmacenBeneficiosEstudiantes {
private ArrayList<Beneficios > listaBeneficios;

    public AlmacenBeneficiosEstudiantes() {
        listaBeneficios = new ArrayList<>();
    }
    // CREATE   (Agregar)
    public boolean agregarBeneficio(Beneficios b) {
        if (b == null || b.getIdBeneficio().isEmpty()) return false;
        if (buscarBeneficio(b.getIdBeneficio()) != null) return false;
        listaBeneficios.add(b);
        return true;
    }
    // READ   (Buscar por ID) //  Leer
    public Beneficios buscarBeneficio(String id) {
        for (Beneficios b : listaBeneficios) {
            if (b.getIdBeneficio().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }
    // UPDATE   (Modificar)
    public boolean modificarBeneficio(String id, String nuevoNombre, double nuevoMonto) {
        Beneficios b = buscarBeneficio(id);
        if (b != null) {
            b.setNomBeneficio(nuevoNombre);
            b.setMontoBeneficio(nuevoMonto);
            return true;
        }
        return false;
    }
    //   DELETE        (️ Eliminar)
    public boolean eliminarBeneficio(String id) {
        Beneficios b = buscarBeneficio(id);
        if (b != null) {
            listaBeneficios.remove(b);
            return true;
        }
        return false;
    }
    // Listar todos
    public ArrayList<Beneficios > getListaBeneficios() {
        return listaBeneficios;
    }
}
package datos;
import logica.Beneficios;
import logica.Beneficios;
import java.util.ArrayList;
/**
 *
 * @author fzupi
 */
public class AlmacenBeneficios {
    private ArrayList<Beneficios > lista;

    public AlmacenBeneficios() {   // ARRAYS
        lista = new ArrayList<>();
    }
    //  Verifica si ya existe un beneficio con ese ID
    public boolean existeId(String idBeneficio) {
        for (Beneficios b : lista) {
            if (b.getIdBeneficio().equals(idBeneficio)) {
                return true;
            }
        }
        return false;
    }
    // AGREGA
    public boolean agregarBeneficio(Beneficios nuevo) {      // CREATE beneficio Id si no existiera
        if (!existeId(nuevo.getIdBeneficio())) {
            lista.add(nuevo);
            return true;
        } else {
            return false;
        }
    }
    // LEE
    public ArrayList<Beneficios> getLista() {        //  READ
        return lista;
    }
    //  ACTUALIZA
    public boolean actualizarBeneficio(String idBeneficio, Beneficios actualizado) {    //UPDATE beneficio por Id
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdBeneficio().equals(idBeneficio)) {
                lista.set(i, actualizado);
                return true;
            }
        }
        return false;
    }
    //ELIMINA
    public boolean eliminarBeneficio(String idBeneficio) {       //DELETE beneficio por ID
        for (Beneficios b : lista) {
            if (b.getIdBeneficio().equals(idBeneficio)) {
                lista.remove(b);
                return true;
            }
        }
        return false;
    }
}
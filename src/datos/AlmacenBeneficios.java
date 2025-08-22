package datos;

import logica.Beneficios;
import java.util.ArrayList;

public class AlmacenBeneficios {
    private final ArrayList<Beneficios> listaBeneficios = new ArrayList<>();

    // Create
    public boolean agregar(Beneficios b) throws Exception {
        if (b == null) throw new Exception("Beneficio nulo");
        if (buscarPorId(b.getIdBeneficio()) != null) 
            throw new Exception("IdBeneficio duplicado");
        return listaBeneficios.add(b);
    }

    // Read
    public Beneficios buscarPorId(String id) {
        for (Beneficios b : listaBeneficios) {
            if (b.getIdBeneficio().equals(id)) return b;
        }
        return null;
    }

    // Update
    public boolean modificar(Beneficios nuevo) throws Exception {
        Beneficios actual = buscarPorId(nuevo.getIdBeneficio());
        if (actual == null) throw new Exception("No existe idBeneficio");
        actual.setNomBeneficio(nuevo.getNomBeneficio());
        actual.setDescripcion(nuevo.getDescripcion());
        actual.setMontoBeneficio(nuevo.getMontoBeneficio());
        return true;
    }

    // Delete
    public boolean eliminar(String id) {
        Beneficios b = buscarPorId(id);
        if (b == null) return false;
        return listaBeneficios.remove(b);
    }

    // Listar
    public ArrayList<Beneficios> listar() {
        return new ArrayList<>(listaBeneficios);
    }
}

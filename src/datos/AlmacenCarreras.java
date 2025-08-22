package datos;

import logica.Carreras;
import java.util.ArrayList;

public class AlmacenCarreras {
    private final ArrayList<Carreras> listaCarreras = new ArrayList<>();

    // Create (Agrega una carrera nueva si no existe una igual al id)
    public boolean agregar(Carreras c) throws Exception {
        if (c == null) throw new Exception("Carrera nula");
        if (buscarPorId(c.getIdCarrera()) != null) throw new Exception("IdCarrera duplicado");
        return listaCarreras.add(c);
    }

    // Read (Buscar carrera por id)
    public Carreras buscarPorId(int id) {
        for (Carreras c : listaCarreras) {
            if (c.getIdCarrera() == id) return c;
        }
        return null;
    }

    // Update (Modificar datos de una carrera existente)
    public boolean modificar(Carreras nueva) throws Exception {
        Carreras actual = buscarPorId(nueva.getIdCarrera());
        if (actual == null) throw new Exception("No existe idCarrera");
        actual.setNomCarrera(nueva.getNomCarrera());
        actual.setGrado(nueva.getGrado());
        return true;
    }

    // Delete (Eliminar carrera por id)
    public boolean eliminar(int id) {
        Carreras c = buscarPorId(id);
        if (c == null) return false;
        return listaCarreras.remove(c);
    }

    // Listar todas las carreras
    public ArrayList<Carreras> listar() {
        return new ArrayList<>(listaCarreras);
    }
}

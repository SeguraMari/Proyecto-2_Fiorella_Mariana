package datos;

import logica.Carreras;
import java.util.ArrayList;

public class AlmacenCarreras {
    private final ArrayList<Carreras> carreras = new ArrayList<>();

    
    // Create 
    public boolean insertar(Carreras c) throws Exception {
        if (c == null) throw new Exception("Carrera nula");
        if (buscarPorId(c.getIdCarrera()) != null) throw new Exception("IdCarrera duplicado");
        return carreras.add(c);
    }
    // Read 
    public Carreras buscarPorId(int id) {
        for (Carreras c : carreras) if (c.getIdCarrera() == id) return c;
        return null;
    }

    // Update 
    public boolean modificar(Carreras nueva) throws Exception {
        Carreras actual = buscarPorId(nueva.getIdCarrera());
        if (actual == null) throw new Exception("No existe idCarrera");
        actual.setNomCarrera(nueva.getNomCarrera());
        actual.setGrado(nueva.getGrado());
        return true;
    }
    //Delete 
    public boolean eliminar(int id) {
        Carreras c = buscarPorId(id);
        if (c == null) return false;
        return carreras.remove(c);
    }

    public ArrayList<Carreras> listar() { return new ArrayList<>(carreras); }
}

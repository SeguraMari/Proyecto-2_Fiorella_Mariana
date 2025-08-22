package datos;

import logica.Personas;
import java.util.ArrayList;

public class AlmacenPersonas {
    private final ArrayList<Personas> listaPersonas = new ArrayList<>();

    // Create
    public boolean agregar(Personas p) throws Exception {
        if (p == null) throw new Exception("Persona nula");
        if (buscarPorCedula(p.getCedula()) != null) 
            throw new Exception("Cédula duplicada");
        return listaPersonas.add(p);
    }

    // Read
    public Personas buscarPorCedula(String cedula) {
        for (Personas p : listaPersonas) {
            if (p.getCedula().equals(cedula)) return p;
        }
        return null;
    }

    // Update
    public boolean modificar(Personas nueva) throws Exception {
        Personas actual = buscarPorCedula(nueva.getCedula());
        if (actual == null) throw new Exception("No existe la persona");
        actual.setNombre(nueva.getNombre());
        actual.setFechNac(nueva.getFechNac());
        actual.setDireccion(nueva.getDireccion());
        actual.setTelefono(nueva.getTelefono());
        actual.setEmail(nueva.getEmail());
        return true;
    }

    // Delete
    public boolean eliminar(String cedula) {
        Personas p = buscarPorCedula(cedula);
        if (p == null) return false;
        return listaPersonas.remove(p);
    }

    // Listar
    public ArrayList<Personas> listar() {
        return new ArrayList<>(listaPersonas);
    }
}

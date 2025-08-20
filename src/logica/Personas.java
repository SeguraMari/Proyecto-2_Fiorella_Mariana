
package logica;

import java.time.LocalDate;

public class Personas {
    private String cedula;
    private String nombre;
    private String apellidos;
    private LocalDate fechNac;
    private String direccion;
    private String telefono;
    private String email;

    public Personas(String cedula, String nombre, String apellidos, LocalDate fechNac, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechNac = fechNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Personas() {
        this.cedula = "";
        this.nombre =  "";
        this.apellidos = "";
        this.fechNac = null;
        this.direccion = "";
        this.telefono = "";
        this.email = ""; 
    }   
    // Getters y Setters
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public LocalDate getFechNac() {
        return fechNac;
    }
    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
       @Override
    public String toString() {
        return "Persona {cedula='" + cedula + "', nombre='" + nombre + "'}";
    }
}
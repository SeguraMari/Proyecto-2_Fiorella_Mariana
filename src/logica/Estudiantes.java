package logica;

import logica.Personas;
import java.util.Calendar;
//  Clase Estudiante -     Hereda de Persona.
public class Estudiantes extends Personas {
    private String carnet;
     private java.util.Calendar fechIngreso;
    private java.util.Calendar fechEgreso;
    private int carrera;
    
    public Estudiantes(String carnet, Calendar fechIngreso, Calendar fechEgreso, String carrera) {
        this.carnet = carnet;
        this.fechIngreso= fechIngreso;
        this.fechEgreso = fechEgreso;
        this.carrera = 0;
    }
    public Estudiantes() {
        this.carnet= "";
        this.fechIngreso =  null;
        this.fechEgreso = null;
        this.carrera = 0;
    }   
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public Calendar getFechIngreso() {
        return fechIngreso;
    }
    public void setFechIngreso(Calendar fechIngreso) {
        this.fechIngreso = fechIngreso;
    }
    public Calendar getFechEgreso() {
        return fechEgreso;
    }
    public void setFechEgreso(Calendar fechEgreso) {
        this.fechEgreso = fechEgreso;
    }
    public int getCarrera() {
        return carrera;
    }
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
}
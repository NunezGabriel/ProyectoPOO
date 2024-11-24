/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

/**
 *
 * @author emili
 */
public abstract class Cita {
    private String fecha;
    private String hora;
    private String especialidad;
    private String estado;
    
    public Cita(String especialidad){
        this.especialidad = especialidad;
    }
    
    public Cita(String fecha, String hora, String especialidad){
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public abstract void registrarCita();
}

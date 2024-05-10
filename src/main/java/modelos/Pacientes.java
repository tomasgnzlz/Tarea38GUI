/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import com.sun.jdi.LocalVariable;
import java.time.LocalDate;

/**
 *
 * @author tomas
 */
public class Pacientes {

    // Declaración de atributos
    private String id_paciente;
    private String nombre;
    private String fechaNacimiento;
    private String grupoSanguineo;
    private String rh;
    private int numeroDonaciones;

    // Constructor
    public Pacientes(String id_paciente, String nombre, String fechaNacimiento, String grupoSanguineo, String rh, int numeroDonaciones) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
        this.numeroDonaciones = numeroDonaciones;
    }

    public Pacientes() {
    }

    // Getters y Setters
    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public int getNumeroDonaciones() {
        return numeroDonaciones;
    }

    public void setNumeroDonaciones(int numeroDonaciones) {
        this.numeroDonaciones = numeroDonaciones;
    }

    //toString
    @Override
    public String toString() {
        return "Pacientes{"
                + "id_paciente=" + id_paciente
                + ", nombre=" + nombre
                + ", fechaNacimiento=" + fechaNacimiento
                + ", grupoSanguineo=" + grupoSanguineo
                + ", rh=" + rh
                + ", numeroDonaciones=" + numeroDonaciones
                + '}';
    }

}

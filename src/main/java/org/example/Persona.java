package org.example;
import javafx.fxml.FXML;

import java.util.Objects;
public class Persona {
    private String nombre,apellidos,edad;
    public Persona(String nombre, String apellidos,String edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre);
    }

}
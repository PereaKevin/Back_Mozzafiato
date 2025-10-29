package org.example.roles;

import org.example.modelos.ModeloUsuario;

import java.time.LocalDate;

public class Administrador extends ModeloUsuario {

    public Administrador() {
    }

    public Administrador(Integer id, String nombre, String apellido, String gmail, String contraseña, String ciudad, String fechaNacimiento, String telefono, String sexo, String alergia) {
        super(id, nombre, apellido, gmail, contraseña, ciudad, fechaNacimiento, telefono, sexo, alergia);
    }

    @Override
    public String toString() {

        return "Administrador{" +
                "id=" + this.getId() +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", gmail='" + this.getGmail() + '\'' +
                ", contraseña='" + this.getContraseña() + '\'' +
                ", ciudad='" + this.getCiudad() + '\'' +
                ", fechaNacimiento=" + this.getFechaNacimiento() +
                ", telefono='" + this.getTelefono() + '\'' +
                ", sexo=" + this.getSexo() +
                ", alergia=" + this.getAlergia() +
                '}';
    }
}

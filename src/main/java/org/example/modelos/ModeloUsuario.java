package org.example.modelos;

import java.time.LocalDate;

public class ModeloUsuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String gmail;
    private String contraseña;
    private String ciudad;
    private String fechaNacimiento;
    private String telefono;
    private String sexo;
    private String alergia;

    public ModeloUsuario() {
    }

    public ModeloUsuario(Integer id, String nombre, String apellido, String gmail, String contraseña, String ciudad, String fechaNacimiento, String telefono, String sexo, String alergia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.contraseña = contraseña;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.sexo = sexo;
        this.alergia = alergia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    @Override
    public String toString() {
        return "ModeloUsuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", gmail='" + gmail + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", sexo='" + sexo + '\'' +
                ", alergia='" + alergia + '\'' +
                '}';
    }
}
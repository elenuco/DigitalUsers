package com.Usuarios.usuarios.Models;

public class Usuarios {
    private Long IDUsuarios;
    private String Nombre;
    private String Usuario;
    private String CorreoElectronico;
    private String Telefono;
    private String Direccion;

    public Long getIDUsuarios() {
        return IDUsuarios;
    }

    public void setIDUsuarios(Long IDUsuarios) {
        this.IDUsuarios = IDUsuarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}

package com.Usuarios.usuarios.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Usuarios.usuarios.Models.Usuarios;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuariosController {
    @RequestMapping(value="Usuarios/{IDUsuarios}")
    public Usuarios getUsuario(@PathVariable Long IdUsuarios) {
        Usuarios Usuarios= new Usuarios();
        Usuarios.setIDUsuarios(IdUsuarios);
        Usuarios.setNombre("Usuario");
        Usuarios.setUsuario("Usuario0");
        Usuarios.setCorreoElectronico("CorreoElectronico");
        Usuarios.setTelefono("Telefono");
        Usuarios.setDireccion("Direccion");
        return Usuarios;
    }

    @RequestMapping(value="Usuarios")
    //@RequestMapping(method = RequestMethod.GET)
    public List<Usuarios> getUsuarios() {
        List<Usuarios> usuarios = new ArrayList<>();

        Usuarios usuario = new Usuarios();
        usuario.setIDUsuarios(1L); // Cambiado el ID a 1L
        usuario.setNombre("Usuario");
        usuario.setUsuario("Usuario0");
        usuario.setCorreoElectronico("CorreoElectronico");
        usuario.setTelefono("Telefono");
        usuario.setDireccion("Direccion");

        Usuarios usuario2 = new Usuarios();
        usuario2.setIDUsuarios(2L);
        usuario2.setNombre("Usuario2");
        usuario2.setUsuario("Usuario1");
        usuario2.setCorreoElectronico("CorreoElectronico2");
        usuario2.setTelefono("Telefono2");
        usuario2.setDireccion("Direccion2");

        usuarios.add(usuario);
        usuarios.add(usuario2);

        return usuarios;
    }

    @RequestMapping(value="Usuarios/updateUsuario")
    public Usuarios updateUsuario(){
        Usuarios Usuarios= new Usuarios();
        Usuarios.setNombre("Usuario");
        Usuarios.setUsuario("Usuario0");
        Usuarios.setCorreoElectronico("CorreoElectronico");
        Usuarios.setTelefono("Telefono");
        Usuarios.setDireccion("Direccion");
        return Usuarios;
    }
    @RequestMapping(value="Usuarios/deleteUsuario")
    public Usuarios deleteUsuario(){
        Usuarios Usuarios= new Usuarios();
        Usuarios.setNombre("Usuario");
        Usuarios.setUsuario("Usuario0");
        Usuarios.setCorreoElectronico("CorreoElectronico");
        Usuarios.setTelefono("Telefono");
        Usuarios.setDireccion("Direccion");
        return Usuarios;
    }
    @RequestMapping(value="Usuarios/searchUsuario")
    public Usuarios searchUsuario(){
        Usuarios Usuarios= new Usuarios();
        Usuarios.setNombre("Usuario");
        Usuarios.setUsuario("Usuario0");
        Usuarios.setCorreoElectronico("CorreoElectronico");
        Usuarios.setTelefono("Telefono");
        Usuarios.setDireccion("Direccion");
        return Usuarios;
    }
}

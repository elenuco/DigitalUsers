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
    public  List<Usuarios> getUsuario(@PathVariable Long IdUsuarios) {
        List <Usuarios>usuarios=new ArrayList<>();
        Usuarios Usuarios= new Usuarios();
        Usuarios.setIDUsuarios(IdUsuarios);
        Usuarios.setNombre("Usuario");
        Usuarios.setUsuario("Usuario0");
        Usuarios.setCorreoElectronico("CorreoElectronico");
        Usuarios.setTelefono("Telefono");
        Usuarios.setDireccion("Direccion");
        Usuarios Usuarios2= new Usuarios();
        Usuarios2.setIDUsuarios(IdUsuarios);
        Usuarios2.setNombre("Usuario");
        Usuarios2.setUsuario("Usuario0");
        Usuarios2.setCorreoElectronico("CorreoElectronico");
        Usuarios2.setTelefono("Telefono");
        Usuarios2.setDireccion("Direccion");
        usuarios.add(usuario1);


        return Usuarios;
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

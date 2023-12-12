package com.Usuarios.usuarios;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import javax.persistence.Table;
@Entity
@Table(name="Usuarios")
@ToString
@SpringBootApplication
public class Usuarios {
    @Id
    @Getter @Setter @Column(name="IDUsuarios")
	private Long IDUsuario;
    @Getter @Setter @Column(name="Nombre")
    private String Nombre;
    @Getter @Setter @Column(name="Usuario")
    private String Usuario;
    @Getter @Setter @Column(name="CorreoElectronico")
    private String CorreoElectronico;
    @Getter @Setter @Column(name="Telefono")
    private String Telefono;
    @Getter @Setter @Column(name="Direccion")
    private String Direccion;


}

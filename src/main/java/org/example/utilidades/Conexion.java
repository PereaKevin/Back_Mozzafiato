package org.example.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String url="jdbc:mysql://localhost:3306/mozzafiato_basedatos";
    private String usuario="root";
    private String contraseña="";

    public Conexion() {
    }

    public Conexion(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Connection conectar(){
        try {
            Connection conexionHaciaBD = DriverManager.getConnection(this.url, this.usuario, this.contraseña);
            System.out.println("👍🏻 exito en la conexion");
            return conexionHaciaBD;
        }catch (SQLException error){
            System.out.println("💩 fallamos"+error.getMessage());
            return null;
        }
    }

}

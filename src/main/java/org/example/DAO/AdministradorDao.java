package org.example.DAO;

import org.example.roles.Administrador;
import org.example.utilidades.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorDao {
    public void registratAdmin(Administrador datoAdmin){
        String sql="INSERT INTO admin(nombre, apellido, gmail, contraseña, ciudad, fechaNacimiento, telefono, sexo, alergia) VALUES(?,?,?,?,?,?,?,?,?)";

        Conexion conexion = new Conexion();

        try {
            Connection conectar = conexion.conectar();
            PreparedStatement consulta = conectar.prepareStatement(sql);

            consulta.setString(1,datoAdmin.getNombre());
            consulta.setString(2,datoAdmin.getApellido());
            consulta.setString(3,datoAdmin.getGmail());
            consulta.setString(4,datoAdmin.getContraseña());
            consulta.setString(5,datoAdmin.getCiudad());
            consulta.setString(6,datoAdmin.getFechaNacimiento());
            consulta.setString(7,datoAdmin.getTelefono());
            consulta.setString(8,datoAdmin.getSexo());
            consulta.setString(9,datoAdmin.getAlergia());

            consulta.executeUpdate();
            System.out.println("Exito guardado en usuario en BD");

        }catch (SQLException error){
            System.out.println("Fallamos guardando el usuario "+error.getMessage());
        }
    }
}

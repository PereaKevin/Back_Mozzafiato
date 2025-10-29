package org.example;

import org.example.DAO.AdministradorDao;
import org.example.roles.Administrador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AdministradorDao administradorDao = new AdministradorDao();
        Administrador administrador = new Administrador();

        System.out.println("Bienvenido Admin");

        System.out.println("Digita tu nombre: ");
        administrador.setNombre(leer.nextLine());

        System.out.println("Digita tu apellido: ");
        administrador.setApellido(leer.nextLine());

        System.out.println("Digita tu gmail: ");
        administrador.setGmail(leer.nextLine());

        System.out.println("Digita tu contraseña: ");
        administrador.setContraseña(leer.nextLine());

        System.out.println("Digita tu ciudad: ");
        administrador.setCiudad(leer.nextLine());

        System.out.println("Digita tu fechaNacimiento: ");
        administrador.setFechaNacimiento(leer.nextLine());

        System.out.println("Digita tu telefono: ");
        administrador.setTelefono(leer.nextLine());

        System.out.println("Digita tu sexo: ");
        administrador.setSexo(leer.nextLine());

        System.out.println("Digita tu alergia: ");
        administrador.setAlergia(leer.nextLine());

        administradorDao.registratAdmin(administrador);
    }
}
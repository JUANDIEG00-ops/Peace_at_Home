package com.peaceathome.app;

import com.peaceathome.conexion.Conexion;
import java.sql.Connection;

public class TestConexion {

    public static void main(String[] args) {

        Connection con = Conexion.conectar();

        if (con != null) {
            System.out.println("Prueba de conexión exitosa.");
        } else {
            System.out.println("No se pudo conectar.");
        }
    }
}
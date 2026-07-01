package com.peaceathome.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL =
            "jdbc:sqlserver://localhost:1433;"
            + "databaseName=PeaceAtHome;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "user=peaceadmin;"
            + "password=Peace12345!;";

    public static Connection conectar() {

        Connection con = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(URL);

            System.out.println("✅ Conexión exitosa a la base de datos.");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC no encontrado.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("❌ Error al conectar:");
            e.printStackTrace();
        }

        return con;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalapangPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CONNECTION {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/salapangguiapp",
                "root",
                ""
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
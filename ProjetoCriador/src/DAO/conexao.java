/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Aluno
 */
public class conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/integrador";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnection() throws SQLException{
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          return DriveManager.getConnection(URL, USER, PASSWORD);
      }  catch (ClassNotFoundException e) {
          
          throw new SQLException("Driver nao encontrado.", e);
          
      }
      
    }
    
}

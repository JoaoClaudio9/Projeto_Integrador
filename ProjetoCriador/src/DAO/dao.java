/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.conexao.getConnection;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class dao {
    public List<String> buscarNomesOrigens() throws SQLException {
        List<String> origens = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conexao = getConnection();
            stmt = conexao.prepareStatement("SELECT Origem FROM Origens");
            rs = stmt.executeQuery();
            while (rs.next()){
                origens.add(rs.getString("Origem"));
            }
        }catch (SQLException e){
            throw new RuntimeException("erro ao buscar as origens", e);
        }finally{
            if (rs != null){
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
            if (conexao != null){
                conexao.close();
            }
        }
        return origens;
    }
    
    public List<String> buscarClasses() throws SQLException {
        List<String> classes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = getConnection();
            stmt = conexao.prepareStatement("SELECT Nome_Classe FROM Classes");
            rs = stmt.executeQuery();
            while (rs.next()) {
                classes.add(rs.getString("Nome_Classe"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar classes.", e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
        return classes;
    }
            
    
    }
    


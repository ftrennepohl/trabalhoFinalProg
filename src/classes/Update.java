/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Pichau
 */
public class Update {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() throws SQLException {
        // SQLite connection string
        String url = "jdbc:sqlite:dbTrab.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void deleteFromCars(String placa) throws SQLException{
        String sql = "DELETE FROM carros WHERE placa = ?";
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, placa);
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteFromBikes(String placa) throws SQLException{
        String sql = "DELETE FROM motos WHERE placa = ?";
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, placa);
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }   
    public void deleteFromClients(String cpf) throws SQLException{
        String sql = "DELETE FROM clientes WHERE cpf = ?";
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,cpf);
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void updateCarros(String dataEntrega, String placa, boolean isAlugado) throws SQLException {
        String sql = "UPDATE carros SET estadoAlugado = ?, dataEntregar = ? WHERE placa = ?";
        try (
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setBoolean(1, isAlugado);
            pstmt.setString(2, dataEntrega);
            pstmt.setString(3, placa);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateMotos(String dataEntrega, String placa, boolean isAlugado) throws SQLException {
        String sql = "UPDATE motos SET estadoAlugado = ?, dataEntregar = ? WHERE placa = ?";
        try (
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setBoolean(1, isAlugado);
            pstmt.setString(2, dataEntrega);
            pstmt.setString(3, placa);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateClientes(String cpf, String placaVeiculoAlugado) throws SQLException {
        String sql = "UPDATE clientes SET placaVeiculoAlugado = ? WHERE cpf = ?";
        try (
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, placaVeiculoAlugado);
            pstmt.setString(2, cpf);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

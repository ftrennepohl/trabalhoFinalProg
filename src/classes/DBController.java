package classes;

import java.io.*;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DBController {
    private final static String dbNome = "C:\\Users\\Fabricio\\Documents\\GitHub\\trabalhoFinalProg\\dbTrab.db";
    private static Connection dbConn;
    
    
    //Funções para o banco de dados
    
    // Usar atributos static, só pode ter uma conexão com o BD
    
    // NÃO CONECTAR NO BANCO PARA CARREGAR DADOS DO BD, A FUNÇÃO JÁ FAZ ISSO
    
    public static void conectarNoBanco() throws Exception{
        
        File f = new File(dbNome);
        if (!f.exists()) throw new Exception("Arquivo de banco de dados nao existe!");
        if (dbConn == null){
            Class.forName("org.sqlite.JDBC");
            dbConn = DriverManager.getConnection("jdbc:sqlite:" + dbNome);
        }
    }
    
    public static void desconectarDoBanco() throws SQLException{
        dbConn.close();
    }
    
    public static void atualizarMoto(Date dataEntrega, String placa) throws SQLException, Exception{
        String where = "UPDATE motos SET estadoAlugado = ?, dataEntregar = ? WHERE placa = ?";
        PreparedStatement stmt;
        try{ 
            Connection conn = connect();
            stmt = conn.prepareStatement(where);
            stmt.setBoolean(1, true);
            stmt.setDate(2, dataEntrega);
            stmt.setString(3, placa);
            stmt.executeUpdate();
        }catch(SQLException e){
            throw new Exception("Erro ao atualizar: " + e.getMessage());
        }
    }
    public static void atualizarCarro(Date dataEntrega, String placa) throws SQLException, Exception{
        String where = "UPDATE carros SET estadoAlugado = ?, dataEntregar = ? WHERE placa = ?";
        PreparedStatement stmt;
        try{ 
            stmt = dbConn.prepareStatement(where);
            stmt.setInt(1, 1);
            stmt.setDate(2, dataEntrega);
            stmt.setString(3, placa);
            stmt.executeUpdate();
        }catch(SQLException e){
            throw new Exception("Erro ao atualizar: " + e.getMessage());
        }
    }
    
    public static void atualizarCliente(String placa, String cpf) throws SQLException, Exception{
        String where = "UPDATE clientes SET placaVeiculoAlugado = ? WHERE cpf = ?";
        PreparedStatement stmt;
        try{
            stmt = dbConn.prepareStatement(where);
            stmt.setString(1, placa);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
        }catch(SQLException e){
            throw new Exception("Erro ao atualizar: " + e.getMessage());
        }
    }
    public static void salvarCarroBD(String placa, String modelo, String marca, int potencia, double preco, boolean alugado, Date alugadoEm, Date alugadoAte, String classificacao, int idCliente, String nomeCliente) throws Exception{
        String ins = "INSERT INTO carros (placa, modelo, marca, potencia, classificacao, idCliente, estadoAlugado, dataAlugado, dataEntregar, preco) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = dbConn.prepareStatement(ins);
            stmt.setString(1, placa);
            stmt.setString(2, modelo);
            stmt.setString(3, marca);
            stmt.setInt(4, potencia);
            stmt.setString(5, classificacao);
            stmt.setInt(6, idCliente);
            stmt.setBoolean(7, alugado);
            stmt.setDate(8, alugadoEm);
            stmt.setDate(9, alugadoAte);
            stmt.setDouble(10, preco);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir carro: " + e.getMessage());
        }
    }
    
    public static void salvarMotoBD(String placa, String modelo, String marca, int potencia, double preco, boolean alugado, Date alugadoEm, Date alugadoAte, String classificacao, int idCliente, String nomeCliente) throws Exception{
        String ins = "INSERT INTO motos (placa, modelo, marca, potencia, classificacao, idCliente, estadoAlugado, dataAlugado, dataEntregar, preco) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = dbConn.prepareStatement(ins);
            stmt.setString(1, placa);
            stmt.setString(2, modelo);
            stmt.setString(3, marca);
            stmt.setInt(4, potencia);
            stmt.setString(5, classificacao);
            stmt.setInt(6, idCliente);
            stmt.setBoolean(7, alugado);
            stmt.setDate(8, alugadoEm);
            stmt.setDate(9, alugadoAte);
            stmt.setDouble(10, preco);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir moto: " + e.getMessage());
        }
    }
    
    public static void salvarClienteBD(String nome, int idade, String sexo, String cpf, int id, String placaVeiculoAlugado, String cnh) throws Exception{
        String ins = "INSERT INTO clientes (nome, idade, sexo, cpf, id, placaVeiculoAlugado, cnh) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = dbConn.prepareStatement(ins);
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, sexo);
            stmt.setString(4, cpf);
            stmt.setInt(5, id);
            stmt.setString(6, placaVeiculoAlugado);
            stmt.setString(7, cnh);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir cliente: " + e.getMessage());
        }
    }
    
    
    
    private static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + dbNome;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static ResultSet carregarInfosCarros() throws Exception{
        String select = "SELECT * FROM carros";
        ResultSet rset = null;
        
        try{
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
    public static ResultSet carregarInfosMotos() throws Exception{
        String select = "SELECT * FROM motos";
        ResultSet rset = null;
        try{
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
    public static ResultSet carregarInfosClientes() throws Exception{
        String select = "SELECT * FROM clientes";
        ResultSet rset = null;
        try{
            Statement stmt = dbConn.createStatement();
            // Connection conn = connect();
            // Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
    
    public static List<List<String>> selectAllCarros(){
       List<List<String>> listOfLists = new ArrayList<>();
        

       try{
            ResultSet rs = carregarInfosCarros();

             // loop through the result set
             while (rs.next()) {
                 List<String> innerList = new ArrayList<>();
                 innerList.add(rs.getString("marca"));
                 innerList.add(rs.getString("modelo"));
                 innerList.add(rs.getString("preco"));
                 innerList.add(rs.getString("dataEntregar"));
                 if(rs.getBoolean("estadoAlugado"))
                 {
                    innerList.add("Alugado");
                 }
                 else
                 {
                    innerList.add("Disponível");                    
                 }
                 innerList.add(rs.getString("idCliente"));
                 listOfLists.add(innerList);
             }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       
       return listOfLists;
    }
    
     public List<List<String>> selectAllMotos(){
       List<List<String>> listOfLists = new ArrayList<>();
        

       try{
            ResultSet rs = carregarInfosMotos();

             // loop through the result set
             while (rs.next()) {
                 List<String> innerList = new ArrayList<>();
                 innerList.add(rs.getString("marca"));
                 innerList.add(rs.getString("modelo"));
                 innerList.add(rs.getString("preco"));
                 innerList.add(rs.getString("dataEntregar"));
                 if(rs.getBoolean("estadoAlugado"))
                 {
                    innerList.add("Alugado");
                 }
                 else
                 {
                    innerList.add("Disponível");                    
                 }
                 
                 innerList.add(rs.getString("idCliente"));
                 listOfLists.add(innerList);
             }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       
       return listOfLists;
    }
}
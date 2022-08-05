package classes;

import java.io.*;
import java.sql.*;
import java.sql.Date;

public class DBController {
    private String dbNome;
    Connection dbConn;
    
    public DBController(String dbNome){
        this.dbNome = dbNome;
    }
    
    //Funções para o banco de dados
    public void conectarNoBanco() throws Exception{
        File f = new File(this.dbNome);
        if (!f.exists()){
            throw new Exception("Arquivo de banco de dados nao existe!");
        }
        Class.forName("org.sqlite.JDBC");
        this.dbConn = DriverManager.getConnection("jdbc:sqlite:" + this.dbNome);
    }
    
    public void desconectarDoBanco() throws SQLException{
        this.dbConn.close();
    }
 
           
    public void salvarCarroBD(int idCarro, String modelo, String marca, int potencia, double preco, boolean alugado, Date alugadoEm, Date alugadoAte, String classificacao, int idCliente, String nomeCliente) throws Exception{
        String ins = "INSERT INTO carros (idCarro, modelo, marca, potencia, classificacao, idCliente, nomeCliente, estadoAlugado, dataAlugado, dataEntregar, preco values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = this.dbConn.prepareStatement(ins);
            stmt.setInt(1, idCarro);
            stmt.setString(2, modelo);
            stmt.setString(3, marca);
            stmt.setInt(4, potencia);
            stmt.setString(5, classificacao);
            stmt.setInt(6, idCliente);
            stmt.setString(7, nomeCliente);
            stmt.setBoolean(8, alugado);
            stmt.setDate(9, alugadoEm);
            stmt.setDate(10, alugadoAte);
            stmt.setDouble(11, preco);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir carro: " + e.getMessage());
        }
    }
    
    public void salvarMotoBD(int idMoto, String modelo, String marca, int potencia, double preco, boolean alugado, Date alugadoEm, Date alugadoAte, String classificacao, int idCliente, String nomeCliente) throws Exception{
        String ins = "INSERT INTO carros (idMoto, modelo, marca, potencia, classificacao, idCliente, nomeCliente, estadoAlugado, dataAlugado, dataEntregar, preco values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = this.dbConn.prepareStatement(ins);
            stmt.setInt(1, idMoto);
            stmt.setString(2, modelo);
            stmt.setString(3, marca);
            stmt.setInt(4, potencia);
            stmt.setString(5, classificacao);
            stmt.setInt(6, idCliente);
            stmt.setString(7, nomeCliente);
            stmt.setBoolean(8, alugado);
            stmt.setDate(9, alugadoEm);
            stmt.setDate(10, alugadoAte);
            stmt.setDouble(11, preco);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir carro: " + e.getMessage());
        }
    }
    
    public void salvarClienteBD(String nome, int idade, String sexo, String cpf, int id, String placaVeiculoAlugado) throws Exception{
        String ins = "INSERT INTO clientes (nome, idade, sexo, cpf, id, placaVeiculoAlugado) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = this.dbConn.prepareStatement(ins);
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, sexo);
            stmt.setString(4, cpf);
            stmt.setInt(5, id);
            stmt.setString(6, placaVeiculoAlugado);
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("Erro ao inserir carro: " + e.getMessage());
        }
    }
    
    public ResultSet carregarInfosCarros() throws Exception{
        String select = "SELECT idCarro, modelo, marca, potencia, classificacao, idCliente, nomeCliente, estadoAlugado, dataAlugado, dataEntregar, preco FROM carros";
        ResultSet rset = null;
        
        try{
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
    public ResultSet carregarInfosMotos() throws Exception{
        String select = "SELECT idMoto, modelo, marca, potencia, classificacao, idCliente, nomeCliente, estadoAlugado, dataAlugado, dataEntregar, preco FROM carros";
        ResultSet rset = null;
        try{
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
    public ResultSet carregarInfosClientes() throws Exception{
        String select = "SELECT nome, idade, sexo, alugando,idAlugado FROM clientes";
        ResultSet rset = null;
        try{
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(select);
        } catch(SQLException e){
            throw new Exception("Erro ao buscar a palavra: " + e.getMessage());
        }
        return rset;
    }
}
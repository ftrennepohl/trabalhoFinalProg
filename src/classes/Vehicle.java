package classes;

import java.util.Date;

public abstract class Vehicle{

    protected String placa;
    protected int clienteAlugandoId = 0;

    protected String modelo;
    protected String marca;
    protected boolean alugado;
    protected double preco;
    protected Date alugadoAte;
    protected Date alugadoEm;

    
    public Vehicle(String modelo, String marca, double preco, String placa) throws Exception{
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.alugado = false;
        this.alugadoEm = null;
        this.alugadoAte = null;
        if (placaValida(placa)) this.placa = placa;
        else throw new Exception("Placa inválida");
    }
    
    private boolean placaValida(String placa){
        return (placa.length() == 7);
    }
        
    
    public void setClienteAlugandoId(int clienteAlugandoId) {
        this.clienteAlugandoId = clienteAlugandoId;
    }
    
    //Getters
    
    public int getClienteAlugandoId() {
        return clienteAlugandoId;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public boolean getAlugado() {
        return alugado;
    }
    
    public Date getAlugadoEm()throws Exception {
        if(alugado)return alugadoEm;
        else return null;
    }
    
    public Date getAlugadoAte()throws Exception {
        if(alugado)return alugadoAte;
        else return null;
    }

    //Métodos
    public void alugar(int ano, int mes, int dia) throws Exception{
        if(this.alugado) throw new Exception("Veículo já alugado");
        
        this.alugadoAte = new Date(ano, mes, dia);
        this.alugadoEm =  new Date(System.currentTimeMillis());
        
        if(alugadoAte.after(alugadoEm)) this.alugado = true;
        else throw new Exception("Data Inválida");
    }
    

    public void devolverVeiculo() {
        this.alugado = false;
    }
}

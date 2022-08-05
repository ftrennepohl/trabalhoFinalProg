package classes;

import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class Moto extends Vehicle {
    
    private static String[] classificacoesValidas = {"Street", "Trail", "Scooter", "Sport", "Touring"};
     
    private int cil;
    private String classificacao;
    private boolean classExiste;
    
    public Moto(String modelo, String marca, int cil,String classificacao, double preco, String placa) throws Exception{
        super(modelo, marca, preco, placa);
        this.cil = cil;
        classExiste = false;
        for(String classif : classificacoesValidas)if(classif.equals(classificacao)) {this.classificacao = classificacao; classExiste = true;}
        if (!classExiste) throw new Exception("classificação inválida");
    }
    
    public int getCilindradas(){
        return cil;
    }
    
    public String getClassificacao() throws Exception{
        if (classExiste) return classificacao;
        throw new Exception("Classificação não definida");
    }
}

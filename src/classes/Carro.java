package classes;

/**
 *
 * @author Fabricio
 */

public class Carro extends Vehicle {
    private static String[] classificacoesValidas = {"Subcompacto", "Hatch", "Sedan", "SUV", "Picape", "Utilitario"};
    
    private int cv;
    private String classificacao;
    private boolean classExiste;
    
    public Carro(String modelo, String marca, double preco, String classificacao,int cv, String placa) throws Exception{
        super(modelo, marca, preco, placa);
        this.cv = cv;
        classExiste = false;
        for(String classif : classificacoesValidas)if(classif.equals(classificacao)) {this.classificacao = classificacao; classExiste = true;}
        if (!classExiste) throw new Exception("classificação inválida");
    }
    
    public String getclassificacao() throws Exception{
        if (classExiste) return classificacao;
        throw new Exception("Classificação não definida");
    }
}

package classes;

/**
 *
 * @author Fabricio
 */
import java.util.List;
import java.util.Arrays;

public class Cliente {
    
    private int clienteId;
    private String cpf;

    private String nome;
    private String sexo;
    private int idade;
    private String placaVeiculoAlugado;
    private String tipoCnh;
    
    public Cliente(int clienteId, String nome, String sexo, int idade, String cpf, String placa, String tipoCnh) throws Exception{
        this.clienteId = clienteId;
        this.nome = nome;
        if (sexo.equals("M") || sexo.equals("F")) this.sexo = sexo;
        else throw new Exception("Sexo inválido. Deve ser M ou F.");
        this.idade = idade;
        this.placaVeiculoAlugado = placa;
        if (cpfEValido(cpf))this.cpf = cpf;
        else throw new Exception("CPF inválido");
        if(tipoCnhEValido(tipoCnh)) this.tipoCnh = tipoCnh;
        else throw new Exception("Tipo de CNH inválido.");
    }
    
    public static boolean cpfEValido(String cpf){
        List<String> invalidos = Arrays.asList("00000000000", "11111111111", "22222222222", "33333333333", "44444444444", "55555555555", "66666666666", "77777777777", "88888888888", "99999999999");
        if (cpf.length() != 11 || invalidos.contains(cpf)) return false;
        
        char[] aux = new char[11];
        cpf.getChars(0, 9, aux, 0);
        int len = 10, soma = 0, j = 0, k = 9;
        for(int i = 0; i<2; i++){
            while(len > 1){
                soma += (Character.getNumericValue(aux[j]) * len);
                len --;
                j++;
            }
            aux[k] = Character.forDigit(((soma*10)%11)%10, 10);
            System.out.println(aux[k]);
            soma = j = 0;
            len = 11;
            k++;
        }
        return cpf.charAt(9) == aux[9] && cpf.charAt(10) == aux[10];
    }
    
    private boolean tipoCnhEValido(String cnh){
        return cnh.equals("A") || cnh.equals("B") || cnh.equals("AB");
    }
    
    
    public int getclienteId(){
        return clienteId;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
       this.idade = idade;
    }
        
    public String getPlacaAlugado(){
        return placaVeiculoAlugado;
    }
}

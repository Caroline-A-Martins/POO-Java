package curso;

public class Curso {
    private String nome;
    private int duracao;
    private double valor;
   
    
    //metodo construtor com parametros
    public Curso( String nome, int duracao, double valor){
        this.nome=nome;
        this.duracao=duracao;
        this.valor=valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;}
    
    public String getNome(){
        return nome;
    } 
    public int getDuracao(){
        return duracao;
    } 
    public double getValor(){
        return valor;
    } 
}

    

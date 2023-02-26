package testecurso;

import curso.Curso;

public class TesteCurso {
    
    public static void main(String[] args) {
        Curso c1 = new Curso ("Ingles", 8, 100.00);
        System.out.println("Curso: " + c1.getNome());
        System.out.println("Duracação: " + c1.getDuracao());
        System.out.println("Valor: " + c1.getValor());
        
        c1.setNome("Francês");
        System.out.println("Curso: " + c1.getNome());
    }
    
}

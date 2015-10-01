/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author HeuberLima
 */
public class testeRetangulo {
    
    public static void main(String[] args) {
      
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        //Cria o objeto retangulo do tipo Retangula
        //e o instancia como um novo objeto
        Retangulo retangulo = new Retangulo();
        
        //Mensagem para o usuario
        System.out.print("Digite o comprimento...: ");
        //Lê o que foi digitado pelo usuario
        //e armazena na variavel local
        double comp = teclado.nextDouble();
        
        System.out.print("Digite a largura.......: ");
        double larg = teclado.nextDouble();
        
        //Seta o valor digitado pelo usuário no atributo da classe
        retangulo.setComprimento(comp);
        retangulo.setLargura(larg);
        
        retangulo.calcularPerimetro();
        retangulo.calcularArea();
        
        System.out.println("O perimetro é.: " + retangulo.getPerimetro());
        System.out.println("A área é......: " + retangulo.getArea());
        
        System.out.println("Fim");
        
        
    }
    
}


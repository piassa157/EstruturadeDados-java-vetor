/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author Piassa
 */
public class EstruturaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vetores vetor1 = new Vetores(6);
        
        vetor1.adiciona("lala");
        vetor1.adiciona("lele");
        vetor1.adiciona("lili");
        vetor1.adiciona("lolo");
        vetor1.adiciona("lulu");
        
        System.out.println(vetor1.busca(0));
        vetor1.adicionaPosicao(2, "L");
        System.out.println(vetor1.buscaSequencial("L"));
        System.out.println(vetor1.toString());
        System.out.println(vetor1.tamanho());
    }
    
}

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
public class Vetores {
    
    private String[] elementos;
    private int tamanho;
    
    
    public Vetores(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho=0;
    }
    
    public boolean adiciona(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            
            return true;
        }
        
        return false;
    }
     
    
    public void adicionaPosicao(int posicao, String elemento) {
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posicao invalida!");
        }
        
        for(int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }
    
    //getTamanho
    public int tamanho(){
        return this.tamanho;
    }
    
    
    //busca simples
    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posicao invalida!");
        }
        
        return this.elementos[posicao];
    }
    
    //buscaSequencial
    public String buscaSequencial(String elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return this.elementos[i];
            }
        }
        
        return null;
    }
    
    @Override
    public String toString(){
        
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for(int i = 0; i < this.tamanho; i++){
             s.append(this.elementos[i]);
             s.append(",");
        }
        
        s.append("]");
        
        return s.toString();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junejercicio2;

import java.util.Comparator;

/**
 *
 * @author ANDRESLF
 */
public class Cliente {

    public Cliente() {
    }

   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    int idade;
    String nome;

    public Cliente(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public  boolean maiordeidade() {
        
        if(idade<18){
            return false;
        }
        else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "Cliente{" + "idade=" + idade + ", nome=" + nome + '}';
    }
}

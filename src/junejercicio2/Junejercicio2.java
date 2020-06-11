/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ANDRESLF
 */
public class Junejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Cliente cliente1= new Cliente(19,"paco");
        Cliente cliente2= new Cliente(22,"luis");
        Cliente cliente3= new Cliente(14,"juan");
        Cliente cliente5=new Cliente(31,"miguel");
        Cliente cliente4= new Cliente(29,"pepe");
        ArrayList<Cliente> clientes= new ArrayList();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        System.out.println(cliente1.maiordeidade());
        System.out.println(adultomenor(clientes));
       
        
    }
    public static  String adultomenor(ArrayList<Cliente> clientes){
        ArrayList <Cliente> adultos= new ArrayList();
        Cliente adultomaior = new Cliente();
        Cliente adultomaior1= new Cliente();
        for (Cliente cliente: clientes){
            if (cliente.maiordeidade()){
                adultos.add(cliente);
                System.out.println(cliente.toString());
            }
            
        }
        for (int i = 0; i < adultos.size()-1; i++) {
            if(adultos.get(i).getIdade()>adultos.get(i+1).getIdade())
            adultomaior=adultos.get(i);
            else{adultomaior=adultos.get(i+1);}
        }
  return adultomaior.getNome();
          
  }}

            
            

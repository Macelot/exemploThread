/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplothread;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        
        Thread t1,t2;
        
        t1=new Thread(cliente);
        t2=new Thread(produto);
        
        t1.start();
        t2.start();
        
    }
    
}

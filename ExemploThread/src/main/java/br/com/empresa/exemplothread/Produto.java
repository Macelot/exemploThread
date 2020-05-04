package br.com.empresa.exemplothread;

import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marce
 */
public class Produto implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                FileWriter fw = new FileWriter("D:\\pasta\\produto.txt",true);
                fw.write(i+"\n");
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}

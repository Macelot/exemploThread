/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplothread;

import java.io.FileWriter;

/**
 *
 * @author marce
 */
public class Cliente implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("a");
            try {
                FileWriter fw = new FileWriter("D:\\pasta\\cliente.txt",true);
                fw.write("a\n");
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}

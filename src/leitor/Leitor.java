/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Mikaele
 */
public class Leitor {
    
    public static void ler(String arquivo) throws IOException{
     InputStream is = new FileInputStream(arquivo);
     InputStreamReader isr = new InputStreamReader(is);
        try (BufferedReader br = new BufferedReader(isr)) {
            String s = br.readLine(); // primeira
            
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }  } // primeira linha
   

    }
    
    public static void escrever(String arquivo,String msg) throws IOException {
         
        OutputStream os = new FileOutputStream(arquivo);
     OutputStreamWriter osw = new OutputStreamWriter(os);
      try (BufferedWriter bw = new BufferedWriter(osw)) {
          bw.write(msg);
      }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
  public static void main(String[] args) throws IOException {
        escrever("arquivo.txt","Mikaele");
        ler("arquivo.txt");
   }
    
}

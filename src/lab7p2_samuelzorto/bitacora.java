/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_samuelzorto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author szorto
 */
public class bitacora implements Runnable{
    private JProgressBar barra;

    public bitacora(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    
   
    
    @Override
    public void run() {         
        while(true){            
            try {
                File f=new File("./bitacora.txt");
                FileWriter fw=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(barra.getValue());
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}

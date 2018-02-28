/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12_java3_payslips;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author suimi
 */
public class Utility {
    /**
     * . 
     * Write object to the filename. 
     * 
     * @param filename
     * @param isOverwrite
     * @param list
     * @throws IOException 
     */
    private static void writeToFile(String filename, boolean isOverwrite, ArrayList<Object> list) throws IOException{
        FileWriter fw = null;
        PrintWriter  out = null;

        try{
            fw = new FileWriter(filename, isOverwrite);
            out = new PrintWriter(fw);
            
            for(Object t : list){
                out.println(t.toString());
            }
       }finally{
            if (out != null)
                    out.close();

            if(fw != null)
                    fw.close();  
      }
    }    
}

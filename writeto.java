/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import static javax.script.ScriptEngine.FILENAME;

/**
 *
 * @author darsheel
 */
public class writeto {
   BufferedWriter bw = null;
    FileWriter fw = null;
     
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;

       
    void write(String s1, String s2) throws IOException{
         fh = new FileHandler("LOG.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
              logger.info(s1+"     is committed to   "+ s2);
       
    }
     }
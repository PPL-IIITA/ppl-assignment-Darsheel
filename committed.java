/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author darsheel
 */
public class committed {
         
          Question1 rr = new Question1();
          writeto wr = new writeto();
         void check(ArrayList<girl> girllist,ArrayList<boy> boylist) throws IOException{
         int n = girllist.size();n=n-1;int i;
         int j = boylist.size();
         while(n >= 0){
             int maintance=girllist.get(n).getMaintainance();
             int attract=girllist.get(n).getAttractiveness();
             for(i=0;i<j;i++){
                if(boylist.get(i).getBudget()>=maintance && boylist.get(i).getMin_attractiveness()<=attract && boylist.get(i).isStatus()){
                        wr.write(girllist.get(n).getName(),boylist.get(i).getName());
                        boylist.get(i).setStatus(false);
                        break;
                 }
             }n--;
             
             
        
        }
          
         }
    
    }
    


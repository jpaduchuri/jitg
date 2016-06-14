/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author miracle
 */
public class NameOrder {
    public static void main(String[] args) {
        
        
       TreeSet ts=new TreeSet();
       ts.add("jagan");
       ts.add("charan");
       ts.add("pillay");
       ts.add("avinash");
       
       
       Iterator itr=ts.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  
       
    }
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author miracle
 */
public class Copyfiles {
    
    public void copydata(file source, file dest)
    {
        FileInputStream fi=null;
        fi = new FileInputStream(source);
        FileOutputStream fo=null;
        fo = new FileOutputStream(dest);
                
        
}
}

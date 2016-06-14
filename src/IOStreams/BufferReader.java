/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author miracle*/
 
class BufferReader {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileReader fr = new FileReader("D:\\my.txt");
        
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        
        System.out.print("reading file success..");
    fr.close();
}
}














































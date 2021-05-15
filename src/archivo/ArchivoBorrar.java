/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.BufferedReader;

import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dmiss
 */


public class ArchivoBorrar {
    
     File archivoBr;
      
      public void crearArchivoBr(){
        
         try {
            archivoBr = new File("AddressBookBr.txt");
            if (archivoBr.createNewFile()) {
                JOptionPane.showMessageDialog(null,"AddressBook BR Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
            }   
        }  
      
      public void escribirEnArchivoBr(Copia copia){
          
          try{ 
              
              FileWriter escrituraBr = new FileWriter(archivoBr, true);
          escrituraBr.write(copia.getLineaBr()+"\r\n");
          escrituraBr.close();
              
          }catch(IOException e){
              
              System.out.println(e);
          }
     
      
            }
      
      public void renombrarBr(){
     
         File oldFile = new File("AddressBookBr.txt");
          File newFile = new File("AddressBook.txt");
          if (oldFile.renameTo(newFile)){
              System.out.println("renombrado");
          }else System.out.println("renombrado");
          

      }
      
      
         public void eliminarArchivoBr(){
          archivoBr = new File("AddressBookBr.txt");
          archivoBr.delete();
      }
         
      

}
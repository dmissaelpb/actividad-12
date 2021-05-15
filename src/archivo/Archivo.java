package archivo;

import java.io.*;
import javax.swing.JOptionPane;


public class Archivo {
    
      File archivo;
    
      public void crearArchivo() {
        try {
            archivo = new File("AddressBook.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null,"AddressBook Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo(Persona persona){
           try(FileWriter escritura = new FileWriter(archivo, true);){
                
                escritura.write(persona.getNombre() + "%"  + persona.getTelefono() + "\r\n");
              //  escritura.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      
      
      
      public void renombrar(){
          File oldFile = new File("AddressBookBr.txt");
          File newFile = new File("AddressBook.txt");
          if (oldFile.renameTo(newFile)){
              System.out.println("renombrado");
          }else System.out.println("existe");
          {
              crearArchivo();
          }
      }
      
       
      
      
      public void eliminarArchivo(){
          archivo = new File("AddressBook.txt");
          archivo.delete();
          
      }
      
      
}

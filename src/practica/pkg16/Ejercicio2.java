/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Catolica
 */
public class Ejercicio2 {
    
    public static void cat(File file) {
    RandomAccessFile input = null;
    String line = null;
    try {
    input = new RandomAccessFile(file, "r");
    while ((line = input.readLine()) != null) {
    System.out.println(line);
    }
    return;
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally {
    if (input != null) {
        try {
            input.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
   }
    
}

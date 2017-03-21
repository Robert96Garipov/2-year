/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Robert Garipov
 */
public class Data {
    
    private static final String fileName = "C:\\Users\\ДНС\\Desktop\\TestSpring\\src\\main\\java\\Goods\\data.txt";
    
    public static void addTextTXT(String fullname, String email, String address) {
        File outputFile = new File(fileName);
        try {
            if(!outputFile.exists()){
                outputFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(outputFile.getAbsoluteFile(),true));

            try {
                out.println(fullname);
                out.println(email);
                out.println(address);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String getTextTXT() throws FileNotFoundException{
        File outputFile = new File(fileName);
        StringBuilder sb = new StringBuilder();
    
        exists(fileName);
        try {
            BufferedReader in = new BufferedReader(new FileReader(outputFile.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
            }
            } finally {
            in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
        
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}    
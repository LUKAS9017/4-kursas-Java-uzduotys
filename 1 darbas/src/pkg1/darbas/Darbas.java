/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.darbas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 15734
 */
public class Darbas {

    /**
     * @param args the command line arguments
     */
    
    static int AGE = 12;
    static String text = "Laba diena visi!";
    
    
    public static void main(String[] args) {
        /*
        String text2;
        int skaicius1  =  456;
        System.out.println(AGE);
        System.out.println(text);
        text2 = "Viso gero";
        System.out.println(text.concat(" ").concat(text2));
        
        writeTextToFile("C:\\Naujas aplankas (2)\\text.txt", "Tekstas i faila");
        */
        greeting(26);
    }
    
    public static int sum(int sk1, int sk2) {
        int result = sk1 + sk2;
        return result;
    }
    
    public static void writeTextToFile(String fileName, String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
    public static void greeting(int valanda) {
        if (valanda >= 0 && valanda <= 12) {
            System.out.println("Labas rytas");
        } else {
            if (valanda > 12 && valanda <= 18) {
                System.out.println("Laba diena");
            } else {
                System.out.println("Labas vakaras");
            }
        }
    }
}

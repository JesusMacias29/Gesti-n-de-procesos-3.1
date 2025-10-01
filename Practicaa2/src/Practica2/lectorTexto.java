package Practica2;

import java.io.*;

public class lectorTexto {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("entrada.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: el archivo entrada.txt no existe.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                
            }
        }
    }
}


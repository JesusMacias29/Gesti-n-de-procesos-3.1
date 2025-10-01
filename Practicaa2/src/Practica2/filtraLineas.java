package Practica2;

import java.io.*;

public class filtraLineas {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        try {
            while ((linea = br.readLine()) != null) {
                if (linea.length() > 20) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer la entrada estándar.");
        }
    }
}



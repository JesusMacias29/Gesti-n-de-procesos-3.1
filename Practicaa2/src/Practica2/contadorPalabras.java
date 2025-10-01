package Practica2;

import java.io.*;

public class contadorPalabras {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        int contador = 0;
        try {
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.trim().split("\\s+");
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].isEmpty()) {
                        contador++;
                    }
                }
            }
            System.out.println("Número total de palabras: " + contador);
        } catch (IOException e) {
            System.err.println("Error al leer la entrada estándar.");
        }
    }
}



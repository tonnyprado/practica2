package hola;

import java.io.*;

class CountFile {
    public static void main(String[] args)
        throws java.io.IOException, java.io.FileNotFoundException
    {
        int count = 0;
        InputStream is;
        String filename;

        if (args.length >= 1) {
        	 // EJERCICIO: Cree una instancia de FileInputStream, llamada is,
        	 // para leer del fichero que se especifica como args[0]
            filename = args[0];
            
            

        } else {
            is = System.in;
            filename = "Input";
        }

        while (is./* EJERCICIO: utilice un metodo de FileInputStream para leer un caracter */!= -1)
        
            count++;

        System.out.println(filename + " has " + count + " chars.");
    }
}
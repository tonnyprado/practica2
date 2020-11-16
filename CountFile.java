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
        	filename = new String(args[0]);
            is = new FileInputStream(filename);
            
            

        } else {
            is = System.in;
            filename = "Input";
        }

        while (is.read() != -1)
        
            count++;

        System.out.println(filename + " has " + count + " chars.");
    }
}
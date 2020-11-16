package hola;

import java.io.*;

class CopyFile {
    public static void main(String[] args)
        throws java.io.IOException, java.io.FileNotFoundException
    {
        byte[] buffer = new byte[256];
        int count;

        if (args.length == 2) {
            // EJERCICIO: Cree una instancia de FileInputStream, llamada is,
            // para leer del fichero que se especifica como args[0]
        	FileInputStream is = new FileInputStream(args[0]);
        	
            
            // EJERCICIO: Cree una instancia de FileOutputStream, llamada os,
            // para escribir en el fichero que se especifica como args[1]
        	FileOutputStream os = new FileOutputStream(args[1]);


            while ((count=is.read(buffer)) != -1)
            	os.write(buffer,0,count);
        } else {
            System.out.println("Se necesitan dos argumentos");
        }

    }
}
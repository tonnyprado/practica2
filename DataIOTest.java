//Se trata de escribir en un fichero:
//
// 9.99   12      Java T-shirt
// 9.99   8       Java Mug
// 15.99  13      Duke Juggling Dolls
//
// y luego leerlo y sacarlo por pantalla
// NOTA: los datos numéricos deben escribirse como "números" y
// no como cadenas de caracteres.
// NOTA: los Strings deben escribirse como cadenas de bytes
// no como cadenas de caracteres (1caracter = 2 bytes)
package hola;
import java.io.*;

public class DataIOTest {
    public static void main(String[] args) throws IOException {

        //E/S con DataInputStream y DataOutputStream
        //Conveniente con datos numéricos (stream = secuencia de bytes)
        //Aconsejable para ficheros o sockets pero no para teclado y pantalla

        //EJERCICIO: Instancie un objeto de tipo DataOutputStream para escribir
        //           en el fichero "invoice1.txt"
        DataOutputStream out = new DataOutputStream(new FileOutputStream("invoice1.txt"));

        //EJERCICIO: Instancie un objeto de tipo DataInputStream para leer
        //           del fichero "invoice1.txt"
        DataInputStream in = new DataInputStream(new FileInputStream("invoice1.txt"));

        //Los datos son:
        double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = { "Java T-shirt",
			   "Java Mug",
			   "Duke Juggling Dolls",
			   "Java Pin",
			   "Java Key Chain" };

        //Un bucle para escribir
        for (int i = 0; i < prices.length; i ++) {
            out.writeDouble(prices[i]);
            out.writeChar('\t');
            out.writeInt(units[i]);
            out.writeChar('\t');
            out.writeBytes(descs[i]);
            out.writeChar('\n');
        }
        out.close();

        //Un bucle para leer
        double price;
        int unit;
        String desc;
        double total = 0.0;

        try {
            while (true) {
                //EJERCICIO: leer el primer double del fichero sobre la variable price
            	price = in.readDouble();
                in.readChar();       // throws out the tab
                //EJERCICIO: leer el int siguiente sobre la variable unit
                unit = in.readInt();
                in.readChar();       // throws out the tab
                //EJERCICIO: leer la cadena siguiente sobre la variable desc
                desc = in.readLine();
                System.out.println("You've ordered " +
				              unit + " units of " +
				              desc + " at $" + price);
                total = total + unit * price;
            }
        } catch (EOFException e) {
        }
        System.out.println("For a TOTAL of: $" + total);
        in.close();
        while (true){}
    }
}

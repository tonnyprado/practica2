package hola;

import java.text.*;
import java.util.*;

class Reloj extends Thread {
	int cuenta=0;
	public Reloj(String nombre, int cuenta) {
       super(nombre); this.cuenta=cuenta;
  }
  public void start() {
  	Date h = new Date();
        System.out.println(getName() + "-> " +
        DateFormat.getTimeInstance(3,Locale.FRANCE).format(h) +
        " Faltan " + cuenta + " seg. para la alarma");
        super.start();
    }

  public void run() {
    for (int i = 1; i <= cuenta; i++) {
       	//EJERCICIO: Provoque un retraso de 1000 milisegundos
    	try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    System.out.println(getName() + "Riiinnnng!!!");
  }
}

public class Relojes {
	public static void main(String[] args){
		//EJERCICIO: Cree dos instancias de la clase Reloj
		Reloj reloj1, reloj2;
		reloj1 = new Reloj("uno", 10);
		reloj2 = new Reloj("dos", 20);
		
		reloj1.start();
		reloj2.start();
	}
}
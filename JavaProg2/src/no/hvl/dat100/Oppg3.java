package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg3 {

	public static void main (String[]args) {
		String heltall = showInputDialog("Oppgi eit heltall:");
		int n = parseInt(heltall);
		int a = n;
		int x = 1;
		
		while (n>1) {
	    x *=n;
	    n--;
		}
		System.out.println(a + "! = " + x);
	    }
}


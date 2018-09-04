package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppg2 {

	public static void main(String[] args)  {
			String skatt = showInputDialog("skriv inn skatt:");
			int skatt1 = parseInt(skatt);
												
			if(skatt1 <= (164100)){
			System.out.println("Nettoinntekt er " + skatt1);
			}
            else if (skatt1 <= (230950)){
		    System.out.println("Nettoinntekt er " + (skatt1-skatt1*0.0093));
            }
		    else if (skatt1 <= (580650)) {
			System.out.println("Nettoinntekt er " + (skatt1-skatt1*0.0241));
		    }
		    else if (skatt1 <= (934050)) {
			System.out.println("Nettoinntekt er " + (skatt1-skatt1*0.1152));
		    }
		    else if (skatt1 >= (934051))
			System.out.println("Nettoinntekt er " + (skatt1-skatt1*0.1452));
	}
		
}
												

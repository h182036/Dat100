package no.hvl.dat100.prosjekt;

import static java.lang.Math.*;


import java.util.Locale;

public class GPSUtils {

	public GPSUtils() {
	
	}
	
	// konverter sekunder til string pÂ formen hh:mm:ss
	public static String printTime(int secs) {
		
		//String timestr = "";
		//String TIMESEP = ":";
		
		// TODO
		// OPPGAVE - START
		  int hours = secs / 3600;
          int secondsLeft = secs - hours * 3600;
          int minutes = secondsLeft / 60;
          int seconds = secondsLeft - minutes * 60;

          String timestr = "";
          if (hours < 10)
              timestr += "0";
          timestr += hours + ":";

          if (minutes < 10)
              timestr += "0";
          timestr += minutes + ":";

          if (seconds < 10)
              timestr += "0";
          timestr += seconds ;	
		// OPPGAVE - SLUTT
		
		return timestr;
	}
	
	// beregn maximum av en tabell av doubles med minnst et element
	public static double findMax(double[] da) {

		double max = da[0];

		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}

		return max;
	}

	// beregn minimum av en tabell av doubles med minnst et element
	public static double findMin(double[] da) {

		// fjern = "0.0" n√•r metoden implementeres for ikke f√• forkert minimum
		double min = da[0]; 

		// TODO
		// OPPGAVE - START
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		// OPPGAVE - SLUTT
		return min;
	}

	
	private static int R = 6371000; // jordens radius
	
	// Beregn avstand mellom to gps punkter ved bruk av Haversine formlen
	public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {

		//double a, c, d; // fjern = 1.0
		
		// TODO:
		// OPPGAVE - START
		
		//Haversine formel
		int R = 6371000; // Jordens gjennomsnittsradius i meter.
	    double dLat = Math.toRadians(latitude2-latitude1);
	    double dLng = Math.toRadians(longitude2-longitude1);
	    double sindLat = Math.sin(dLat / 2);
	    double sindLng = Math.sin(dLng / 2);
	    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
	            * Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2));
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    double d = R * c;
		// OPPGAVE - SLUTT
	
        return d;
    }

    // beregn gjennomsnittshastighet i km/t mellom to gps punkter
    public static double speed(int secs, double latitude1, double longitude1, double latitude2, double longitude2) {



        // TODO:
        // OPPGAVE - START

        int R = 6371000; // Jordens gjennomsnittsradius i meter.
        double dLat = Math.toRadians(latitude2-latitude1);
        double dLng = Math.toRadians(longitude2-longitude1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R * c;

        double speed = d * 3.6 / secs;
        // OPPGAVE - SLUTT

        return speed;
    }

    private static int TEXTWIDTH = 10;

    // konverter double til string med 2 decimaler og streng lengde 10
    // eks. 1.346 konverteres til "      1.35" og enhet til slutt
    // Hint: se pÂ String.format metoden

    public static String printDouble(double d) {

        //String str2 = "";

        // TODO
        // OPPGAVE - START
        //String str = (Double.toString(d));

        String str = String.format(Locale.ROOT, "     %5.2f", d);

        // OPPGAVE - SLUTT

        return str;
    }
}

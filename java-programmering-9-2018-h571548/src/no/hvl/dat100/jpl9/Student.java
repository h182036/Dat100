package no.hvl.dat100.jpl9;

public class Student extends Person {
	
	private int studentnummer; 
	private String klasse;
	
	public Student() {
		super();
		
	}

	public Student(String etternamn, String fornamn, long fodselsnummer, int studentnummer, String klasse) {
		// TODO
		
		setFornamn(fornamn);
		setEtternamn(etternamn);
		setFodselsnummer(fodselsnummer);
		this.studentnummer = studentnummer;
		this.klasse = klasse;
		
		
		
		//throw new RuntimeException("Student constructor not implemented");
	}

	public int getStudentnummer() {
		// TODO
		
		return studentnummer;
		
		//throw new RuntimeException("getStudentnummer not implemented");
	}

	public void setStudentnummer(int studentnummer) {
		// TODO
		
		this.studentnummer = studentnummer;
		
		//throw new RuntimeException("setStudentnummer not implemented");
	}

	public String getKlasse() {
		// TODO
		
		return klasse;
		
		//throw new RuntimeException("getKlasse not implemented");
	}

	public void setKlasse(String klasse) {
		// TODO
		
		this.klasse = klasse;
		
		//throw new RuntimeException("setKlasse not implemented");
	}

	@Override
	public String toString() {
		// TODO
		String s = "STUDENT" + "\n" + super.toString() + studentnummer + "\n" + klasse + "\n";
		return s;
		
		//throw new RuntimeException("toString not implemented");

	}

}

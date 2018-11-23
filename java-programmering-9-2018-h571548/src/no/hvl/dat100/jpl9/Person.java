package no.hvl.dat100.jpl9;

public abstract class Person {
	
	private long fodselsnummer;
	private String etternamn;
	private String fornamn;
	
	

	public Person() {	
		
	}	
		


	public Person(String etternamn, String fornamn, long fodselsnummer) {
		// TODO
		this.fodselsnummer = fodselsnummer;
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		
		//throw new RuntimeException("Person constructor not implemented");
	}

	public String getEtternamn() {
		// TODO
		return etternamn;
		
		//throw new RuntimeException("getEtternamn not implemented");
	}

	public void setEtternamn(String etternamn) {
		// TODO
		this.etternamn = etternamn;
		
		//throw new RuntimeException("setEtternamn not implemented");
	}

	public String getFornamn() {
		// TODO
		return fornamn;
		
		//throw new RuntimeException("getFornamn not implemented");
	}

	public void setFornamn(String fornamn) {
		// TODO
		
		this.fornamn = fornamn;
		
		//throw new RuntimeException("setFornamn not implemented");
	}

	public void setFodselsnummer(long fodselsnummer) {
		// TODO
		
		this.fodselsnummer = fodselsnummer;
		
		//throw new RuntimeException("setFodselsnummer not implemented");
	}

	public long getFodselsnummer() {
		// TODO
		
		return fodselsnummer;
		
		//throw new RuntimeException("getFodselsnummer not implemented");
	}

	public boolean erLik(Person person) {
		// TODO
		
		
		return (this.fodselsnummer == person.getFodselsnummer());
		
		//throw new RuntimeException("erLik not implemented");
	}

	public boolean erKvinne() {
		// TODO
		
		long fNr = fodselsnummer / 10;
		fNr = fNr / 10;
		
		if (fNr % 2 == 1) {
			return false;
		} else { 
			return true;
		}
		
		
		//throw new RuntimeException("erKvinne not implemented");
	}

	public boolean erMann() {
		// TODO
		
		
		long fNr = fodselsnummer / 10;
		fNr = fNr / 10;
		
		if (fNr % 2 == 1) {
			return true;
		} else { 
			return false;
		}
		
		//throw new RuntimeException("erMann not implemented");
	}

	@Override
	public String toString() {
		// TODO
		
		String s = fodselsnummer + "\n" + etternamn + "\n" + fornamn + "\n";
		return s;
		
		//throw new RuntimeException("toString not implemented");
	}
}

package no.hvl.dat100.jpl9;

public class PersonSamling {
	
	private int nesteLedige;
	
	private Person[] samling;

	public PersonSamling() {
		
		// TODO
		int lengde = 20;
		
		samling = new Person[lengde];
		nesteLedige = 0;
		
		//new PersonSamling(20);
		
		//throw new RuntimeException("PersonSamling() constructor not implemented");
	}

	public PersonSamling(int lengde) {
		
		
		
		// TODO
		lengde = 40;
		
		samling = new Person[lengde];
		nesteLedige = 0;
		
		
		
		
		
	
		//throw new RuntimeException("PersonSamling() constructor not implemented");
	}

	public int getAntall() {
		
		// TODO
		
		return nesteLedige;
		
		//throw new RuntimeException("getAntall not implemented");
	}

	// DO NOT TOUCH - FOR TESTING PURPOSES ONLY
	public void setAntall(int antall) {
		
		nesteLedige = antall;
	}
	
	public Person[] getSamling() {
		
		// TODO
		return samling;
		
		//throw new RuntimeException("getSamling() not implemented");
	}

	public int finnPerson(Person p) {

		// TODO
		
		for(int i = samling.length - 40; i < samling.length; i++) {
            if (samling[i] == p)
            return i;

        } return -1;
		
	}
		
		
		//throw new RuntimeException("finnPerson not implemented");
		
	

	public boolean finnes(Person p) {
		
		// TODO
		for(int i = samling.length - 40; i < samling.length-1; i++) {
			if (samling[i] == p)
			return true;
			
		} return false; 
			
		
		
		//throw new RuntimeException("finnes not implemented");
	}

	public boolean ledigPlass(Person p) {
		
		

		for(int i = 0; i < samling.length; i++) {
		    if(samling[i] == null) {
		    	
		    }
		    
		    
		    
		    
		} 
		return true;
	}    
		
		
				
		//throw new RuntimeException("ledigPlass not implemented");
		  
	

	public boolean leggTil(Person p) {

		// TODO
		
		for(int i = 0; i < samling.length; i++) {
		    if(samling[i] == null) {
		        samling[i] = p;
            
		    }
		}

		return true;
		
		 
		//throw new RuntimeException("leggTil not implemented");
	} 
	
	public String toString() {
		
		// TODO
		
		return samling.toString();
		
		
		//throw new RuntimeException("toString not implemented");
	}




	public void utvid() {
		
		// TODO
		throw new RuntimeException("utvid not implemented");
	}

	
	public boolean leggTilUtvid(Person p) {

		// TODO
		throw new RuntimeException("leggTilUtvid not implemented");
	}

	public void slett(Person p) {

		// TODO
		throw new RuntimeException("slett not implemented");
	}
} 
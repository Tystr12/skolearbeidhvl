package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	
	
	public Innlegg() {
	
	}
	
	public Innlegg(int id, String bruker, String dato) {
		 likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (innlegg.equals(innlegg)) {
			return true;
		} else {
			return false;
		}

	}
	
	@Override
	public String toString() {
		
		return id + bruker + dato + likes;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab11/oppgave4";
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		try  {
			File file = new File(MAPPE_STR + filnavn);
			Scanner reader = new Scanner(file);
			
			int numline = 1;
			
			String line;
			while (reader.hasNextLine()) {
				line = reader.nextLine();
				System.out.println(numline + " " + line);
				numline++;
				break;
			} 
			reader.close();
			
			
		} catch (Exception e) {
			
		}
		
	}
}

package receiver;
import java.util.Set;
import java.util.HashSet;
import receiver.java.model.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurEditionImplementation {
	
	/*
	fail(String) 
	assertTrue(true) 
	assertsEquals([String message], expected, actual) 
	assertsEquals([String message], expected, actual, tolerance)
	assertNull([message], object)
	assertNotNull([message], object) 
	assertSame([String], expected, actual) 
	assertNotSame([String], expected, actual)
	assertTrue([message], boolean condition) 
	*/

	@Test
	public void test() {
		MoteurEditionImplementation mei = new MoteurEditionImplementation();
		mei.select.debut = 1;
		mei.select.fin = 5;
		mei.buf.zone_texte = "coincoin";
		mei.pp.contenu_presse_papier = "";
		mei.inserer_texte();
		System.out.println(mei.buf.zone_texte);
		mei.inserer_texte();
		System.out.println(mei.buf.zone_texte);
		mei.copier();
		mei.couper();
		mei.coller();
		mei.selectionner();
		
	}

	
	
	
	
}

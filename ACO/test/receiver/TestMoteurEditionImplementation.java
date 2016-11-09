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
		mei.buf.zone_texte = new StringBuffer("coincoin");
		mei.pp.contenu_presse_papier = "";
		mei.inserer_texte(8,8," toucan");//cas à la fin de la chaine
		assertEquals("L'insertion en fin de chaine n'est pas la bonne ou pas au bon endroit", mei.buf.zone_texte.toString().substring(8, mei.buf.zone_texte.toString().length()), " toucan");
		mei.inserer_texte(8,8," dindon");//cas au milieu de la chaine
		assertEquals("L'insertion en milieu de chaine n'est pas la bonne ou pas au bon endroit", mei.buf.zone_texte.toString().substring(8, 15), " dindon");
		mei.inserer_texte(0,8,"canard");//cas au début de la chaine et en remplaçant du texte
		assertEquals("L'insertion en fin de chaine n'est pas la bonne ou pas au bon endroit", mei.buf.zone_texte.toString().substring(0, 8), "canard d");
		mei.copier(6, 13);	//Seul cas de la copie
		assertEquals("La copie du texte n'est pas dans le presse papier", mei.pp.contenu_presse_papier, " dindon");
		mei.coller(mei.buf.zone_texte.toString().length(), mei.buf.zone_texte.toString().length());	//colle à la fin de la chaine
		assertEquals("Le collage en fin de chaine n'est pas le bon ou pas au bon endroit", mei.buf.zone_texte.toString().substring(20, mei.buf.zone_texte.toString().length()), " dindon");
		mei.couper(13, mei.buf.zone_texte.toString().length());
		assertEquals("Le contenu du presse papier ne correspond pas à la coupe", mei.pp.contenu_presse_papier, " toucan dindon");
		assertEquals("Le texte n'a pas été coupé", mei.buf.zone_texte.toString(), "canard dindon");
		mei.coller(6, 13);	//Collage en remplaçant une partie du texte
		assertEquals("Le texte coller en remplaçant une autre chaine fonctionne",mei.buf.zone_texte.toString(), "canard toucan dindon");
		
		
		
		/*
		mei.copier();
		System.out.println(mei.pp.contenu_presse_papier);
		mei.couper();
		System.out.println(mei.pp.contenu_presse_papier);
		System.out.println(mei.buf.zone_texte);
		mei.coller();
		System.out.println(mei.buf.zone_texte);*/
		
	}

	
	
	
	
}

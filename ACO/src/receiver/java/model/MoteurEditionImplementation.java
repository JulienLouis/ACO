package receiver.java.model;
import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import receiver.java.model.*;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MoteurEditionImplementation implements MoteurImplementation
{
	
	public Selection select = new Selection();
	public Buffer buf = new Buffer();
	public PressePapier pp = new PressePapier();
	Scanner scanner = new Scanner(System.in);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * 
	 * @generated
	 * @ordered
	 */
	
	
	public void couper(){
		assertTrue("Rien n'est sélectionné", (select.fin-select.debut != 0)); 
		select.defBornes();		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}
		
		//buf.zone_texte = buf.zone_texte.replace(pp.contenu_presse_papier , "");
		//buf.zone_texte = buf.zone_texte.replace(pp.contenu_presse_papier, "");
		
		assertEquals("La sélection n'a pas été coupé", pp.contenu_presse_papier, buf.zone_texte.toString());//selection vide entre les bornes
		assertTrue("La selection n'a pas été retiré", buf.zone_texte.equals("")); //entre les bornes de la selection
		
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void copier(){
		assertTrue("Rien n'est sélectionné", (select.fin-select.debut != 0));
		select.defBornes();		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}		
		assertTrue("La sélection n'a pas été copier", pp.contenu_presse_papier.equals(buf.zone_texte));	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void coller() {
		assertNotNull("Le presse papier est vide", pp.contenu_presse_papier);
		select.defDebut();
		String subAvant= buf.zone_texte.substring(0,select.debut);		//Avant la selection
		String subApres= buf.zone_texte.substring(select.debut);		//Après la selection
		String temp  = subAvant.concat(pp.contenu_presse_papier).concat(subApres);
		// probleme de type de string buffer 
		//buf.zone_texte = StringBuffer(temp); 
		assertTrue("La sélection n'a pas été coupé", buf.zone_texte.equals(pp.contenu_presse_papier));
	}
	
	/*public String[] diviser(String text, int delimitat){
		String[] res = {"",""};
		for(int i = 0; i < text.length(); i++){
			for(int )
		}
		return res;
	}*/

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Selection> selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<PressePapier> pressePapier;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Buffer> buffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void selectionner(){
		assertNotNull("Rien n'est sélectionné", select.debut);
		assertNotNull("Rien n'est sélectionné", select.fin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void inserer_texte(){
		String avant = buf.zone_texte.toString();
		//buf.zone_texte =  (buf.zone_texte + " " + scanner.next());
		assertNotSame("Le texte ne s'est pas ajouter", buf.zone_texte, avant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MoteurEditionImplementation(){
		super();
	}

}


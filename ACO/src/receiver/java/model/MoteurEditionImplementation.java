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
	//	assertTrue("Rien n'est sélectionné", (select.fin-select.debut != 0)); 
		select.defBornes();		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}
		supprimer_texte();
		//assertEquals("La sélection n'a pas été coupé", pp.contenu_presse_papier, buf.zone_texte.toString());//selection vide entre les bornes
		//assertTrue("La selection n'a pas été retiré", buf.zone_texte.equals("")); //entre les bornes de la selection
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void copier(){
	//	assertTrue("Rien n'est sélectionné", (select.fin-select.debut != 0));
		select.defBornes();		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}		
	//	assertTrue("La sélection n'a pas été copier", pp.contenu_presse_papier.equals(buf.zone_texte));	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void coller() {
		//assertNotNull("Le presse papier est vide", pp.contenu_presse_papier);
		select.defBornes();	//Determine ou est coller la selection
		buf.zone_texte = buf.zone_texte.replace(select.debut, select.fin, pp.contenu_presse_papier);	//colle la selection entre les bornes de la selection
		//assertTrue("La sélection n'a pas été coupé", buf.zone_texte.equals(pp.contenu_presse_papier));	//test à revoir
	}
	

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
		//assertNotNull("Rien n'est sélectionné", select.debut);
		//assertNotNull("Rien n'est sélectionné", select.fin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void inserer_texte(){
		select.defBornes();
		System.out.println("texte à ajouter : ");
		buf.zone_texte =  buf.zone_texte.replace(select.debut, select.fin, " " + scanner.next());
	}
	
	public void supprimer_texte(){
		select.defBornes();	//les bornes de la selection
		buf.zone_texte.delete(select.debut, select.fin);
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


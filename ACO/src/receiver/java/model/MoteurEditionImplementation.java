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

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * 
	 * @generated
	 * @ordered
	 */
	
	
	public void couper(int d, int f){
		select.defBornes(d,f);;		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}
		supprimer_texte(d,f);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void copier(int d, int f){
		select.defBornes(d,f);;		//Permet de connaitre les bornes de la selection
		for (int i = select.debut; i < select.fin; i++){		//ajoute le contenu de la selection dans le presse papier
			pp.contenu_presse_papier = pp.contenu_presse_papier + buf.zone_texte.charAt(i);
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void coller(int d, int f) {
		select.defBornes(d,f);;	//Determine ou est coller la selection
		buf.zone_texte = buf.zone_texte.replace(select.debut, select.fin, pp.contenu_presse_papier);	//colle la selection entre les bornes de la selection
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
	
	public void inserer_texte(int d, int f, String text){
		select.defBornes(d,f);
		buf.zone_texte =  buf.zone_texte.replace(select.debut, select.fin,text);
	}
	
	public void supprimer_texte(int d, int f){
		select.defBornes(d,f);;	//les bornes de la selection
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


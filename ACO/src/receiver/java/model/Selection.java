package receiver.java.model;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Selection
{
	
	Scanner scanner = new Scanner(System.in);
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int debut;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int fin;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<MoteurEditionImplementation> moteurEditionImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Selection(){
		super();
	}
	
	public void defBornes(){
		System.out.println("L'entier du début de la selection : ");
		debut = scanner.nextInt();
		System.out.println("L'entier de la fin de la selection : ");
		fin = scanner.nextInt();
	}
	
	public void defDebut(){
		System.out.println("Ou coller la selection : ");
		debut = scanner.nextInt();
	}
	

}


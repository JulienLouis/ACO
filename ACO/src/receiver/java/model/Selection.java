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
	
	public void defBornes(int d, int f){
		debut = d;
		fin = f;
	}
	
	

}


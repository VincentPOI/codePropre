package ex3;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe repr�sentant une zone, une zone contient plusieurs animaux contenus dans une liste, la quantit� de nourriture consom�e chaque jour et un nom
 * @author ETY5
 *
 */
public abstract class Zone {
	
	/**String nom de la zone*/
	protected String nom;	
	/**Double quantit� de nourriture consom� journali�rement par les animaux de la zone*/
	protected double quantiteNouriture;
	/**List de Animal, contient la liste de tout les animaux pr�sent dans la zone*/
	protected List<Animal> animals = new ArrayList<Animal>();
	
	/**
	 * M�thode permettant de compter les animaux dans la zone
	 * @return int le nombres d'animaux pr�sent dans la zone
	 */
	public int compterAnimaux(){
		return animals.size();
	}
	
	/**
	 * M�thode permettant d'afficher les informations relatives � la zone
	 */
	public void afficherZone(){
		System.out.println("Les animaux de la zone "+this.nom+" : ");
		for (Animal animal : animals){
			System.out.println(animal.toString());
		}
		System.out.println("Nourriture journali�re : "+this.calculerKgsNourritureParJour()+"kg");
	}	
	
	
	/**
	 * @return double la quantit� de nourriture consom� dans la zone journali�rement par les diff�rents animaux de la zone 
	 */
	public double calculerKgsNourritureParJour() {
		return this.compterAnimaux()*this.quantiteNouriture;
	}
	
	/**
	 * M�thode qui permet de remplir une zone avec un animal si son type et son comportement correspond � la zone
	 * @param animal, animal dont il faut v�rifier l'appartenance � une zone du zoo
	 * @return
	 */
	public abstract boolean checkAnimal(Animal animal);
}

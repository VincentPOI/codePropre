package ex3;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe représentant une zone, une zone contient plusieurs animaux contenus dans une liste, la quantité de nourriture consomée chaque jour et un nom
 * @author ETY5
 *
 */
public abstract class Zone {
	
	/**String nom de la zone*/
	protected String nom;	
	/**Double quantité de nourriture consomé journaliérement par les animaux de la zone*/
	protected double quantiteNouriture;
	/**List de Animal, contient la liste de tout les animaux présent dans la zone*/
	protected List<Animal> animals = new ArrayList<Animal>();
	
	/**
	 * Méthode permettant de compter les animaux dans la zone
	 * @return int le nombres d'animaux présent dans la zone
	 */
	public int compterAnimaux(){
		return animals.size();
	}
	
	/**
	 * Méthode permettant d'afficher les informations relatives à la zone
	 */
	public void afficherZone(){
		System.out.println("Les animaux de la zone "+this.nom+" : ");
		for (Animal animal : animals){
			System.out.println(animal.toString());
		}
		System.out.println("Nourriture journalière : "+this.calculerKgsNourritureParJour()+"kg");
	}	
	
	
	/**
	 * @return double la quantité de nourriture consomé dans la zone journalièrement par les différents animaux de la zone 
	 */
	public double calculerKgsNourritureParJour() {
		return this.compterAnimaux()*this.quantiteNouriture;
	}
	
	/**
	 * Méthode qui permet de remplir une zone avec un animal si son type et son comportement correspond à la zone
	 * @param animal, animal dont il faut vérifier l'appartenance à une zone du zoo
	 * @return
	 */
	public abstract boolean checkAnimal(Animal animal);
}

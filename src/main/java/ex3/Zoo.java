package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un zoo avec son nom et ses différentes zones
 * @author ETY5
 *
 */
public class Zoo {

	/**Nom du Zoo*/
	private String nom;
	// private SavaneAfricaine savaneAfricaine;
	// private ZoneCarnivore zoneCarnivore;
	// private FermeReptile fermeReptile;
	// private Aquarium aquarium;
	/**List de Zone contenant les différentes zones du zoo */
	private List<Zone> listeZone = new ArrayList<Zone>();
	

	/**
	 * @return the listeZone
	 */
	public List<Zone> getListeZone() {
		return listeZone;
	}

	/**
	 * @param listeZone the listeZone to set
	 */
	public void setListeZone(List<Zone> listeZone) {
		this.listeZone = listeZone;
	}

	/**
	 * Constructeur du zoo, rempli la liste de zone avec 4 zones différentes
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		listeZone.add(new ZoneSavaneAfricaine());
		listeZone.add(new ZoneAquarium());
		listeZone.add(new ZoneCarnivore());
		listeZone.add(new ZoneFermeReptile());
	}

	/**
	 * Méthode permettant d'ajouter un animal au zoo
	 * @param animal un nouvel animal
	 */
	public void addAnimal(Animal animal) {	
		for (Zone zone : listeZone){
			 if(zone.checkAnimal(animal)){
				 break;
			 };			 
		}
	}

	/**
	 * Méthode permettant d'afficher toutes les informations relatives au zoos
	 */
	public void afficherListeAnimaux() {
		System.out.println(this.nom+" : ");
		for (Zone zone : listeZone){
			zone.afficherZone();			
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	// private SavaneAfricaine savaneAfricaine;
	// private ZoneCarnivore zoneCarnivore;
	// private FermeReptile fermeReptile;
	// private Aquarium aquarium;
	private List<Zone> listeZone = new ArrayList<Zone>();
	

	public Zoo(String nom) {
		this.nom = nom;
		listeZone.add(new ZoneSavaneAfricaine());
		listeZone.add(new ZoneAquarium());
		listeZone.add(new ZoneCarnivore());
		listeZone.add(new ZoneFermeReptile());
	}

	public void addAnimal(Animal animal) {	
		for (Zone zone : listeZone){
			zone.checkAnimal(animal);
		}
	}


	public void afficherListeAnimaux() {
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

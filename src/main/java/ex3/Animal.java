package ex3;

/**
 * Classe représentant un animal avec son nom son type et son comportement
 * @author ETY5
 *
 */
public class Animal {

	/** Enumération TypeAnimal, le type de l'animal */
	private TypeAnimal types;
	/** String nom de l'animal */
	private String nom;
	/** Enumération Comportement, le comportement de l'animal */
	private Comportement comportements;

	/**
	 * @param types
	 * @param nom
	 * @param comportements
	 */
	public Animal(TypeAnimal types, String nom, Comportement comportements) {
		super();
		this.types = types;
		this.nom = nom;
		this.comportements = comportements;
	}

	/**
	 * @return the types
	 */
	public TypeAnimal getTypes() {
		return types;
	}

	/**
	 * @param types
	 *            the types to set
	 */
	public void setTypes(TypeAnimal types) {
		this.types = types;
	}

	/**
	 * @return the comportements
	 */
	public Comportement getComportements() {
		return comportements;
	}

	/**
	 * @param comportements
	 *            the comportements to set
	 */
	public void setComportements(Comportement comportements) {
		this.comportements = comportements;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return this.nom;
	}
}

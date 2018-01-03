package ex3;



public class Animal {
	
	/**Enumération TypeAnimal, le type de l'animal*/
	private TypeAnimal types;
	/**String nom de l'animal*/
	private String nom;
	/**Enumération Comportement, le comportement de l'animal*/
	private Comportement comportements;
	
	public Animal(TypeAnimal types, String nom, Comportement comportements) {
		this.types = types;
		this.nom = nom;
		this.comportements = comportements;
	}

	public TypeAnimal getTypes() {
		return types;
	}
	public void setTypes(TypeAnimal types) {
		this.types = types;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Comportement getComportements() {
		return comportements;
	}
	public void setComportements(Comportement comportements) {
		this.comportements = comportements;
	}
	
	public String toString(){
			return this.nom;
	}
}

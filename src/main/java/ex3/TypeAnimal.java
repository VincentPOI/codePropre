package ex3;

/**
 * Enum�ration d�crivant le type d'un animal
 * @author ETY5
 *
 */
public enum TypeAnimal {
	MAMMIFERE("Mammif�re"),POISSON("Poisson"), REPTILE("Reptile");
	private String type = "";

	private TypeAnimal(String type) {
		this.type = type;
	}
	
	public String toString(){
		return type;
	}
}

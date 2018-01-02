package ex3;

public enum TypeAnimal {
	MAMMIFERE("Mammifère"),POISSON("Poisson"), REPTILE("Reptile");
	private String type = "";

	private TypeAnimal(String type) {
		this.type = type;
	}
	
	public String toString(){
		return type;
	}
}

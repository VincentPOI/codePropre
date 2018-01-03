package ex3;

/**
 * Enumeration decrivant le comportement d'un animal (herbivore ou carnivore)
 * @author ETY5
 *
 */
public enum Comportement {
	HERBIVORE("Herbivore"),CARNIVORE("Herbivore");
	private String comport = "";

	private Comportement(String comport) {
		this.comport = comport;
	}
	
	public String toString(){
		return comport;
	}
}

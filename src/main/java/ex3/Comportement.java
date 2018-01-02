package ex3;

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

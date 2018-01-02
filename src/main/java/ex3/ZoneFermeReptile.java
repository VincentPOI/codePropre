package ex3;

public class ZoneFermeReptile extends Zone {
	
	public ZoneFermeReptile() {
		this.nom= "Ferme reptile";
		this.quantiteNouriture = 0.1;
	}

	@Override
	public boolean checkAnimal(Animal animal) {
		if (animal.getTypes().equals(TypeAnimal.REPTILE)){
			this.animals.add(animal);
			return true;
		}
			return false;
	}
	
}

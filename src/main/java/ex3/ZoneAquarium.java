package ex3;

public class ZoneAquarium extends Zone {
	
	
	public ZoneAquarium() {
		this.nom ="Aquarium";
		this.quantiteNouriture = 0.2;
	}
	
	@Override
	public boolean checkAnimal(Animal animal) {
		if (animal.getTypes().equals(TypeAnimal.POISSON)){
			this.animals.add(animal);
			return true;
		}
			return false;
	}
}

package ex3;

public class ZoneCarnivore extends Zone{
	
	public ZoneCarnivore() {
		this.nom = "Carnivore";
		this.quantiteNouriture = 10;
	}

	@Override
	public boolean checkAnimal(Animal animal) {
		if (animal.getTypes().equals(TypeAnimal.MAMMIFERE) && animal.getComportements().equals(Comportement.CARNIVORE)){
		this.animals.add(animal);
		return true;
	}
		return false;
	}
}

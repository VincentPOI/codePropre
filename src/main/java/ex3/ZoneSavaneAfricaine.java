package ex3;

public class ZoneSavaneAfricaine extends Zone {
	
	public ZoneSavaneAfricaine() {
		this.nom = "Savane Africaine";
		this.quantiteNouriture = 10;
	}

	@Override
	public boolean checkAnimal(Animal animal) {
		if (animal.getTypes().equals(TypeAnimal.MAMMIFERE) && animal.getComportements().equals(Comportement.HERBIVORE)){
			this.animals.add(animal);
			return true;
		}
			return false;
	}

}

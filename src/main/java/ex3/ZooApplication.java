package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "z�bre", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Lion", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "panth�re", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.POISSON, "requin blanc", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.POISSON, "Truite dor�e", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.REPTILE, "Python", Comportement.CARNIVORE));
		zoo.afficherListeAnimaux();
	}

}

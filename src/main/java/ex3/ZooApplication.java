package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Gazelle", Comportement.HERBIVORE));
		zoo.afficherListeAnimaux();
	}

}

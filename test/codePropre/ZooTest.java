/**
 * 
 */
package codePropre;

import static org.junit.Assert.*;

import ex3.Animal;
import ex3.Comportement;
import ex3.TypeAnimal;
import ex3.Zone;
import ex3.ZoneAquarium;
import ex3.ZoneCarnivore;
import ex3.ZoneFermeReptile;
import ex3.ZoneSavaneAfricaine;
import ex3.Zoo;

import org.junit.Test;

/**
 * @author ETY5
 *
 */
public class ZooTest {

	
	@Test
	public void testZoo() {
		Zoo zoo = new Zoo("la palmire");
		assertNotNull(zoo);
		assertTrue(zoo.getNom().equals("la palmire"));
	}

	@Test
	public void testAddAnimal() {
		Zoo zoo = new Zoo("la palmire");
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.POISSON, "requin", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.REPTILE, "boa", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "lion", Comportement.CARNIVORE));
		
		assertTrue(zoo.getListeZone().size() == 4);
		for (Zone zone : zoo.getListeZone()){
			for (Animal animal : zone.getAnimals()){
				if (animal.getNom().equals("gazelle")){
					assertTrue(zone.getNom().equals("Savane Africaine"));
				}else if (animal.getNom().equals("requin")){
					assertTrue(zone.getNom().equals("Aquarium"));
				}else if(animal.getNom().equals("boa")){
					assertTrue(zone.getNom().equals("Ferme reptile"));
				}else if(animal.getNom().equals("lion")){
					assertTrue(zone.getNom().equals("Carnivore"));
				}
			}			
		}
	}
	


}

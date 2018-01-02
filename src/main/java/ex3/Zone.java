package ex3;

import java.util.ArrayList;
import java.util.List;


public abstract class Zone {
	
	protected String nom;	
	protected double quantiteNouriture;
	protected List<Animal> animals = new ArrayList<Animal>();
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public void afficherZone(){
		System.out.println("Les animaux de la zone"+this.nom+" : ");
		for (Animal animal : animals){
			System.out.println(animal.toString());
			System.out.println("Nourriture journalière : "+this.calculerKgsNourritureParJour()+"kg");
		}
	}	
	public double calculerKgsNourritureParJour() {
		return this.compterAnimaux()*this.quantiteNouriture;
	}
	public abstract boolean checkAnimal(Animal animal);
}

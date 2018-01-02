package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	/**decouvertLivretA decouvert autoris� sur le livre */
	private static int decouvertLivretA = 0;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param soldereprésente le solde du compte
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde, decouvertLivretA);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * M�thode qui permet de calculer la r�mun�ration annuelle et de la rajouter
	 * au solde du livretA
	 */
	public void appliquerRemuAnnuelle() {
		solde = solde + solde * tauxRemuneration / 100;
	}


	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

}

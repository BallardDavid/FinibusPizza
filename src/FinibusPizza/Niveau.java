package FinibusPizza;

import java.util.HashMap;


public class Niveau {
	//Nom du niveau
	private String nom;
	//Difficulte du niveau, � choisir selon l'enum�ratuon difficult�
	private Difficulte difficulte; 
	//Liste contenant au maximum les trois types de clients possibles en tant que cl� enfin de savoir le nombre de clients par type
	private HashMap<Client, Integer> clients = new HashMap<Client, Integer>();
	//!------A modifier type selon comment g�rer le temps Valsior ------!
	//Temps total de partie(calculable + marge!)
	private float tempsPartie; 
	//!-----Possible que l'on doive le faire selon l'argent -----!
	//Trois temps, les trois d�signant donc les trois �toiles obtenables (calculable !)
	private float[] scoreAuTemps;
	//!-----Type � v�rifier-------!
	//Tresorerie de d�but de partie(calculable + marge!)
	private float tresorerie;
	
	public Niveau(String nom, Difficulte difficulte, int nbPremierTypeClient, int nbDeuxiemeTypeClient, int nbTroisiemeTypeClient, float margeTresorerie, float margeTemps) {
		this.nom = nom;
		this.difficulte=difficulte;
		//!----- Faire l'inclusion des types clients quand l'enum�ration sera faite -----!//
	}
	/**
	 * Permet d'obtenir la tresorerie du niveau
	 * @return la tresorerie du niveau
	 */
	public float gettresorerie() {
		return tresorerie;
	}
	/**
	 * Permet de calculer la tr�sorerie du niveau, en y ajoutant une marge donn�e dans la cr�ation du niveau
	 * @param tresorerie
	 * @parem marge 
	 */
	public void settresorerie(float tresorerie, float marge) {
		this.tresorerie = tresorerie * marge;
	}
	/**
	 * Permet d'obtenir les r�glages du score, calcul� selon le temps total de jeu
	 * @return un tableau de float contenant les trois temps correspondant aux trois �toiles de score obtenables
	 */
	public float[] getScoreAuTemps() {
		return scoreAuTemps;
	}
	/**
	 * Permet de param�trer les scores obtenables d'un coup
	 * @param scoreAuTemps, qui est un tableau contenant les trois temps possibles li�s aux trois etoiles de score obtenables
	 */
	public void setScoreAuTemps(float[] scoreAuTemps) {
		if(scoreAuTemps.length != 3) {
			throw new IllegalArgumentException("Le tableau doit faire 3 de taille");
		} else {
			this.setScoreAuTemps1(scoreAuTemps[0]);
			this.setScoreAuTemps2(scoreAuTemps[1]);
			this.setScoreAuTemps3(scoreAuTemps[2]);
		}
	}
	public void setScoreAuTemps1(float scoreAuTemps) {
		this.scoreAuTemps[0] = scoreAuTemps;
	}
	public void setScoreAuTemps2(float scoreAuTemps) {
		this.scoreAuTemps[1] = scoreAuTemps;
	}
	public void setScoreAuTemps3(float scoreAuTemps) {
		this.scoreAuTemps[2] = scoreAuTemps;
	}
	public HashMap<Client, Integer> getClients() {
		return clients;
	}

	public float getTempsPartie() {
		return tempsPartie;
	}

	public void setTempsPartie(float tempsPartie) {
		this.tempsPartie = tempsPartie;
	}

	public Difficulte getDifficulte() {
		return difficulte;
	}

	public String getNom() {
		return nom;
	}
	
}

package tpexumen1;

import java.util.Arrays;

public class Epreuve {
	private Candidat tab[];
	private String dénomination;
	private int nbrMax;
	private int nbr;
	private boolean etat;

	Epreuve(String denomination, int max) {
		this.dénomination = denomination;
		this.nbrMax = max;
		tab= new Candidat [nbrMax];
	}

	@Override public String toString() {
		String s= "[ denomination=" + dénomination + ", etat=" + etat +"  les noms des candidats : ( ";
		for(int i=0;i<nbr;i++) {
			s+=tab[i].getNom()+" , ";
		}
		s+= " )";	
		return s;
	}

	void ajoutCandidat(Candidat c) {
		if (!estTerminee() && this.nbrMax > nbr) {
			tab[nbr] = c;
			nbr++;
		}
	}
	void setEtat(boolean etat ) {
		this.etat=false;
	}

	void terminer() {
		this.etat = true;
	}

	boolean estTerminee() {
		return etat;
	}

	Resultat getRecord() {
		Resultat record = null;
			record = tab[0].getResultat();
			for (int i = 1; i < nbr; i++) {
				if (tab[i].getResultat().compareTo(record) == 1) {
					record = tab[i].getResultat();
				}
			}
		return record;
	}

	Candidat getVinqueur(){
		Resultat r = getRecord();
		if (estTerminee()) {
			for (int i=0; i<nbr; i++) {
				if ((tab[i].getResultat()).compareTo(r) == 0) {
					System.out.println(" le candidat vinqueur est : ");
					return tab[i];
				}
			}
		}
		else {
			System.out.println(" epreuve est terminer ! ");
		}
		return null;
	}

	void fixeResultat(int id, Resultat r) throws IllegalUpdateException {
		if(etat) {
			throw new IllegalUpdateException(" error") ;
		}
		else {
			for(int i=0;i<nbr;i++) {
				if(tab[i].getId()==id) {
					tab[i].setResultat(r);
					break;
					}
				}
			}
	}

	Resultat getResultat(int id) {
		for (int i = 0; i < nbr; i++) {
			if (tab[i].getId() == id) {
				return tab[i].getResultat();
			} 
		}
		return null;
	}

}
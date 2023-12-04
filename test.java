package tpexumen1;

public class test {

	public static void main(String[] args) {
		 Epreuve E = new Epreuve("denomination", 10);
			Candidat c1 = new Candidat(1,"roua");
			Candidat c2 = new Candidat(2,"ahlem"); 
			Candidat c3 = new Candidat (3,"hatem");
			E.ajoutCandidat(c1);
			E.ajoutCandidat(c2);
			E.ajoutCandidat(c3);
			System.out.println("l'epreuve est  : ");
			System.out.println(E.toString()+"\n");
			
			ResultatOral ro1 = new ResultatOral ('A');
			ResultatOral ro2 = new ResultatOral ('B');
			ResultatOral ro3 = new ResultatOral ('C');
			try {
				E.fixeResultat(1, ro1);
				E.fixeResultat(2, ro2);
				E.fixeResultat(3, ro3);
			}
			catch ( IllegalUpdateException a){
				System.out.println("erreur");
				a.getMessage();
				a.printStackTrace();
			}
			E.terminer();
			
			System.out.println("Resultat Record  est : "+E.getRecord()+"\n");
			System.out.println(E.getVinqueur());
		}

	
		 

	}



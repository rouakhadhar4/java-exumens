package tpexumen1;

public class ResultatOral implements Resultat {
	private char appréciation ;
	 ResultatOral(char appréciation )
	 {
		 if((this.appréciation=='A')||(this.appréciation=='B') ||(this.appréciation=='C'))
				 {
			       this.appréciation=appréciation;
				 }
	 }
	

	
	@Override
	public String toString() {
		return "ResultatOral [appréciation=" + appréciation + "]";
	}
	@Override
	public int compareTo(Resultat r) 
	{
		if(r instanceof ResultatOral)
		{
		
		if(this.appréciation== ((ResultatOral)r).appréciation)
		{
			return 0;
		}
		else if(this.appréciation<((ResultatOral)r).appréciation)
		{
			return 1;
		}
		else
				return -1;
		}
	
	  else 
		{
			throw new IllegalArgumentException();
		}
		
		
	}
}
	
		
	
	
	


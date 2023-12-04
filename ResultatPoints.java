package tpexumen1;

public class ResultatPoints implements Resultat{
	private  int points_cumulés ;
	ResultatPoints( int points_cumulés)
	 {
		this.points_cumulés=  points_cumulés;
	 }
	@Override
	public String toString() {
		return "ResultatPoints [points_cumulés=" + points_cumulés + "]";
	}
	@Override
	public int compareTo(Resultat r) 
	{
		if(r instanceof ResultatPoints)
		{
		
		if(this.points_cumulés== ((ResultatPoints)r).points_cumulés)
		{
			return 0;
		}
		if(this.points_cumulés== ((ResultatPoints)r).points_cumulés)
		{
			return 1;
		}
		else
				return -1;
		}
		return points_cumulés;
	}
	

		
		
		
		
	}
	
	
	



package tp;

public class Plat {
	private String nomPlat;
	private double prixPlat;
	
	public Plat(String plat, double prix){
		nomPlat = plat;
		prixPlat = prix;
		
	}
	
	public String getNomPlat(){
		return nomPlat;
		
	}
	
	public double getPrixPlat (){
		return prixPlat;
	}
	
	public void setNomPlat(String plat){
		nomPlat = plat;
	}
	
	public void setPrixPlat (double prix) {
		prixPlat = prix;
	}
}

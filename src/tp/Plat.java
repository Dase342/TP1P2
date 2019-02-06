package tp;

public class Plat {
	private String nomPlat;
	private double prixPlat;
	private int qte;
	
	public Plat(String plat, double prix, int quantite){
		nomPlat = plat;
		prixPlat = prix;
		qte = quantite;
		
	}
	
	public String getNomPlat(){
		return nomPlat;
		
	}
	
	public double getPrixPlat (){
		return prixPlat;
	}
	
	public int getQte (){
		return qte;
	}
	
	public void setNomPlat(String plat){
		nomPlat = plat;
	}
	
	public void setPrixPlat (double prix) {
		prixPlat = prix;
	}
	
	public void setQte(int quantite){
		qte = quantite;
	}
}

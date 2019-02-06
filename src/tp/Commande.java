package tp;

public class Commande {
	private Client client;
	private Plat plat;
	
	public Commande (Client clientCommande, Plat platCommande){
		client = clientCommande;
		plat = platCommande;
	}
	
	public Client getClient(){
		return client;
	}
	public Plat getPlat(){
		return plat;
	}
	public void setClient(Client clientCommande){
		client = clientCommande;
	}
	
	public void setPlat(Plat platCommande){
		plat = platCommande;
	}
	
	public double getTotale(){
		
		return plat.getPrixPlat()*plat.getQte();
	}
}

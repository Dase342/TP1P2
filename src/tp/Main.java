package tp;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Plat>  listPlat;
		List<Client> listClient;
		List<Commande> listCommande;
		
		TextFile fichier = new TextFile(System.getProperty("user.dir")+"\\tp1.txt");
		
		try {
			listClient = fichier.getClient();
			listPlat = fichier.getPlat();
			listCommande = fichier.getCommandes( listClient, listPlat );
			
			facture(listClient, listCommande);
			
		} catch ( Exception e ) {
			System.out.println( "Le fichier ne respecte pas le format demandé !" );
		}

	}
	
	public static void facture(List<Client> listClient,List<Commande> listCommande) {
		for(Commande commande: listCommande) {
			commande.getClient().addTotal( commande.getTotale() );
		}
		System.out.println( "Bienvenue chez Barette!\nFactures: ");
		for(Client client: listClient) {
			System.out.println( client );
		}
		
	}

}

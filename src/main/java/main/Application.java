package main;

import entities.Produit;
import services.ProduitService;

public class Application {

	public static void main(String[] args) {
		
	 ProduitService service =new ProduitService();	
	 Produit produit = new Produit(1,"tonic",1.33,12);
	 Produit produit2 = new Produit(2,"Tide",1.45,11);
	 Produit produit3 = new Produit(3,"Tide",1.23,12);
	 service.Ajouter(produit3);
	 service.Ajouter(produit);
	 service.Afficher();
//	 service.Ajouter(produit2);
	 service.Supprimer(3);
	 service.Afficher();
	 Produit produitMiseAJour = new Produit(15, "tonic", 1, 50);
	 service.MiseAJour(produitMiseAJour);
	 service.Afficher();
	 
	}

}

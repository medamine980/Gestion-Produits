package services;

import java.util.ArrayList;

import entities.Produit;

public class ProduitService {
	
	ArrayList<Produit>produits=new ArrayList<Produit>();
	
	public void Ajouter(Produit produit)
	{
		if (produit.getQuantité() < 0 || produit.getPrix() < 0) {
			throw new IllegalArgumentException (
					"La quantité et le prix du produit doivent toujours être positifs"
			);
		}
		for(int i=0;i<produits.size();i++)
		{
			if(produits.get(i).getId()==produit.getId() || produits.get(i).getNom()==produit.getNom())
			{
				throw new IllegalArgumentException("produit deja exist");
				
			}
		
		}
		produits.add(produit);
	}
	
	public void Afficher() {
		
		
		for(int i=0;i<produits.size();i++)
			
		{
			System.out.println(produits.get(i));
		}
	}
	
	
	
	

}

package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Produit;

public class ProduitServicesTest {
	
	
	ProduitService produitService;

	
	@Before
	public void before()
	{
		produitService = new ProduitService(); 
	}
	
	
	@After
	
	public void after()
	{
		
		
		produitService=null;
	}
	
	@Test
	public void TestRecupererParId()
	{
		
		Produit produit = new Produit(2,"chocolat",3,10);
		produitService.Ajouter(produit);
		Produit produitOrigine=produitService.RecupererParId(2);
        assertEquals(produitOrigine,produit);
		
	}

	@Test
    public void testAjoutEtRecupererProduit(){
        int produitId = 1;
        Produit produit = new Produit(produitId, "OMO", 50, 10);
        produitService.Ajouter(produit);
        assertTrue(produitService.RecupererParId(produitId).equals(produit));
    }
    @Test
    public void testMiseAJourProduit(){
        int produitId = 1;
        Produit produit = new Produit(produitId, "Nutella", 40, 8);
        produitService.Ajouter(produit);
        Produit pModifier = new Produit(produitId, "Shampoing", 20, 25);
        produitService.MiseAJour(pModifier);
        assertTrue(produitService.RecupererParId(produitId).equals(pModifier));
    }
    @Test
    public void testSupprimerProduit(){
        int produitId = 8;
        Produit produit = new Produit(produitId, "Commida", 2, 70);
        produitService.Ajouter(produit);
        produitService.Supprimer(produitId);
        assertTrue(produitService.RecupererParId(produitId) == null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testProduitExistanceSupprimer(){
        Produit produitAleatoire = new Produit(1, "X", 1, 4);
        produitService.Ajouter(produitAleatoire);
        produitService.Supprimer(99);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testProduitExistanceMiseAJour(){
        Produit produitAleatoire = new Produit(1, "Trident", 0.5, 80);
        produitService.Ajouter(produitAleatoire);
        Produit produitPourModifier = new Produit(3, "Clorets", 0.5, 100);
        produitService.MiseAJour(produitPourModifier);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testProduitUnicite(){
        String nomProduit = "Sprite";
        Produit p1 = new Produit(1, nomProduit, 12, 10);
        Produit p2 = new Produit(2, nomProduit, 4, 5);
        produitService.Ajouter(p1);
        produitService.Ajouter(p2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidationDonneeQuantite(){
        int quantiteNegatif = -5;
        Produit produit = new Produit(1, "Coca Cola", 10, quantiteNegatif);
        produitService.Ajouter(produit);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testValidationDonneePrix(){
        double prixNegatif = -15.5;
        Produit produit = new Produit(1, "Coca Cola", prixNegatif, 10);
        produitService.Ajouter(produit);
    }
    
    @Test
    public void testRecupererTousProduits() {
    	Produit produit1 = new Produit(1, "X", 10, 55);
    	Produit produit2 = new Produit(2, "Y", 5, 80);
        produitService.Ajouter(produit1);
        produitService.Ajouter(produit2);
        ArrayList<Produit> produits = produitService.RecupererTouts();
        assertTrue(produits.contains(produit1) && produits.contains(produit2));
    }

}

package services;

import static org.junit.Assert.assertEquals;

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
	


}

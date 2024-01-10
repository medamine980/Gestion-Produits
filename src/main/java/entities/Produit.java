package entities;

public class Produit {
	
	
	
	private long Id;
	private String nom; 
	private double prix;
    private int quantité;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
    
    
}

package entities;

public class Produit {
	private long id;
	private String nom; 
	private double prix;
    private int quantité;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
    
    public Produit(long id , String nom , double prix , int quantité)
    {
    	this.id=id;
    	this.nom=nom;
    	this.prix=prix;
    	this.quantité=quantité;
    }
    
    
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantité=" + quantité + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Produit produit = (Produit) obj;
		if(this.id == produit.id && this.nom == produit.nom &&
				this.prix == produit.prix && this.quantité == produit.quantité) {
			return true;
		}
		return false;
	}
	
    
    
    
    
    
    
    
    
}

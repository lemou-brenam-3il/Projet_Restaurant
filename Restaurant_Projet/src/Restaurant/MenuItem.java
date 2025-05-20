package Restaurant;

public abstract class MenuItem {
	protected int id;
	protected String nom;
	protected String description;
	protected double prix;
	
	
	public MenuItem(int id, String nom, String description, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public abstract void afficher();
	
}

package Restaurant;

public abstract class Personnel {
	private int id;
	private String nom;
	private String role;
	
	public Personnel(int id, String nom, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getRole() {
		return role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void ajouter() {
		
	}
	
	public void supprimer() {
		
	}
	public void affecterTable() {
		
	}
	
}

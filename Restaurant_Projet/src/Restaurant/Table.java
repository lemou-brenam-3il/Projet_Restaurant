package Restaurant;

public class Table {
	private int numero;
	private int capacite;
	private String etat;
	
	public Table(int numero, int capacite, String etat) {
		super();
		this.numero = numero;
		this.capacite = capacite;
		this.etat = etat;
	}

	public int getNumero() {
		return numero;
	}

	public int getCapacite() {
		return capacite;
	}

	public String getEtat() {
		return etat;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public void ajouter() {
		
	}
	
	public void supprimer() {
		
	}
	
	public String consulterEtat() {
		return etat;
	}
	
	
}

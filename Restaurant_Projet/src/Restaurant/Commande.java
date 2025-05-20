package Restaurant;

import Restaurant.patterns.state.EtatCommande;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
	private int id;
	private Date date;
	private EtatCommande etat;
	private List<MenuItem> content = new ArrayList<>();
	public Commande(int id) {
		super();
		this.id = id;
		this.date = new Date();
	}
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public EtatCommande getEtat() {
		return etat;
	}
	public List<MenuItem> getContent() {
		return content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setEtat(EtatCommande etat) {
		this.etat = etat;
	}
	public void setContent(List<MenuItem> content) {
		this.content = content;
	}
	
	public void creer() {
        // initialiser la commande
    }

    public void modifier() {
        // modifier items
    }

    public void annuler() {
        // annuler la commande
    }

    public void finaliser() {
        // finaliser
    }
	
	
}

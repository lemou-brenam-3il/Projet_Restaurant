package Restaurant;

public class Boisson extends MenuItem {
	public Boisson(int id, String nom, String description, double prix) {
		super(id, nom, description, prix);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void afficher() {
		System.out.println(nom+ " : " +prix);
	}

}

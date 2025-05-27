package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance;
    private List<Table> tables = new ArrayList<>();
    private List<MenuItem> menuItems = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<Personnel> personnel = new ArrayList<>();
    private List<Ingredient> stock = new ArrayList<>();

    private Restaurant() {}

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void ajouterTable(Table table) {
        tables.add(table);
    }

    public void ajouterMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void creerCommande(Commande commande) {
        commandes.add(commande);
    }

    public void creerReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void ajouterPersonnel(Personnel p) {
        personnel.add(p);
    }

    public void genererRapport() {
        // Implémentation du rapport global
    }
}
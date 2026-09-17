package tp2;

/**
 * Mammifère domestique.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Chien extends Mammifere {

    private String race;

    /**
     * Crée un chien. La gestation est fixée à 63 jours pour l'espèce.
     *
     * @param nom  nom du chien
     * @param age  âge en années
     * @param race race du chien
     */
    public Chien(String nom, int age, String race) {
        super(nom, age, 63);
        this.race = race;
    }

    public void aboyer() {
        System.out.println(getNom() + " : Wouf !");
    }

    public String getRace() {
        return race;
    }
}
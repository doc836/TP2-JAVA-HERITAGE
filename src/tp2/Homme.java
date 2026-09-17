package tp2;

/**
 * Mammifère de l'espèce humaine.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Homme extends Mammifere {

    private String metier;

    /**
     * Crée un humain. La gestation est fixée à 280 jours pour l'espèce.
     *
     * @param nom    nom de la personne
     * @param age    âge en années
     * @param metier métier exercé
     */
    public Homme(String nom, int age, String metier) {
        super(nom, age, 280);
        this.metier = metier;
    }

    public void travailler() {
        System.out.println(getNom() + " travaille comme " + metier + ".");
    }

    public String getMetier() {
        return metier;
    }
}
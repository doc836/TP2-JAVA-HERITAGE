package tp2;

/**
 * Petit mammifère sauteur.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Lapin extends Mammifere {

    private String couleur;

    /**
     * Crée un lapin. La gestation est fixée à 31 jours pour l'espèce.
     *
     * @param nom     nom du lapin
     * @param age     âge en années
     * @param couleur couleur du pelage
     */
    public Lapin(String nom, int age, String couleur) {
        super(nom, age, 31);
        this.couleur = couleur;
    }

    public void bondir() {
        System.out.println(getNom() + " fait un bond.");
    }

    public String getCouleur() {
        return couleur;
    }
}
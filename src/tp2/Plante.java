package tp2;

/**
 * Plante, indépendante de la hiérarchie des animaux.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Plante {

    private String espece;

    private double hauteur;

    /**
     * Crée une plante.
     *
     * @param espece  nom de l'espèce
     * @param hauteur hauteur en centimètres
     */
    public Plante(String espece, double hauteur) {
        this.espece = espece;
        this.hauteur = hauteur;
    }

    /**
     * Fait pousser la plante.
     *
     * @param cm nombre de centimètres gagnés
     */
    public void pousser(double cm) {
        hauteur += cm;
    }

    public String getEspece() {
        return espece;
    }

    public double getHauteur() {
        return hauteur;
    }
}
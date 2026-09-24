package tp2;

/**
 * Plante, indépendante de la hiérarchie des animaux.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Plante {

    /** Compteur partagé par tous les animaux, sert à générer les identifiants. */
    private static int compteur = 0;

    /** Identifiant unique de l'animal, attribué à la création. */
    private final int identifiant;

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
        this.identifiant = ++compteur; // incrémente le compteur partagé puis l'utilise
    }

    /** @return l'identifiant unique de l'animal */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * Redéfinit {@link Object#toString()}.
     *
     * @return une description textuelle incluant l'identifiant
     */
    @Override
    public String toString() {
        return "Je suis une plante et mon identifiant est " + identifiant;
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
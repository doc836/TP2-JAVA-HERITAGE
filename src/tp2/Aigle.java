package tp2;

/**
 * Oiseau rapace.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Aigle extends Oiseau {

    private int altitudeMax;

    /**
     * Crée un aigle.
     *
     * @param nom         nom de l'aigle
     * @param age         âge en années
     * @param envergure   envergure en centimètres
     * @param altitudeMax altitude maximale en mètres
     */
    public Aigle(String nom, int age, double envergure, int altitudeMax) {
        super(nom, age, envergure);
        this.altitudeMax = altitudeMax;
    }

    public void chasser() {
        System.out.println(getNom() + " fond sur sa proie.");
    }

    public int getAltitudeMax() {
        return altitudeMax;
    }
}
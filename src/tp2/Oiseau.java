package tp2;

/**
 * Animal à plumes qui pond des œufs.
 *
 * @author Berkay
 * @version 0.1.0
 */

public class Oiseau extends Animal {

    private double envergure;

    /**
     * Crée un oiseau.
     *
     * @param nom       nom de l'oiseau
     * @param age       âge en années
     * @param envergure envergure en centimètres
     */
    public Oiseau(String nom, int age, double envergure) {
        super(nom, age);
        this.envergure = envergure;
    }

    public void pondre() {
        System.out.println(getNom() + " pond un œuf.");
    }

    public double getEnvergure() {
        return envergure;
    }
}
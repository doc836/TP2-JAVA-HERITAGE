package tp2;

/**
 * Animal qui allaite ses petits.
 *
 * @author Berkay
 * @version 0.1.0
 */
public class Mammifere extends Animal {

    private int dureeGestation;

    /**
     * Crée un mammifère.
     *
     * @param nom            nom du mammifère
     * @param age            âge en années
     * @param dureeGestation durée de gestation en jours
     */
    public Mammifere(String nom, int age, int dureeGestation) {
        super(nom, age); // appelle le constructeur d'Animal, obligatoirement en premier
        this.dureeGestation = dureeGestation;
    }

    public void allaiter() {
        System.out.println(getNom() + " allaite ses petits.");
    }
    public int getDureeGestation() {
        return dureeGestation;
    }
}
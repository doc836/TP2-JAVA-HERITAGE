package tp2;



public class Animal {

    /** Compteur partagé par tous les animaux, sert à générer les identifiants. */
    private static int compteur = 0;

    /** Identifiant unique de l'animal, attribué à la création. */
    private final int identifiant;

    private String nom;

    private int age;

    /**
     * Crée un animal.
     *
     * @param nom nom de l'animal
     * @param age âge en années
     */

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.identifiant = ++compteur;
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
        return "Je suis un animal et mon identifiant est " + identifiant;
    }

    public void vieillir(){
        age++;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }


}

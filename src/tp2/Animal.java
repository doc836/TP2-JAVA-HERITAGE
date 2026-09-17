package tp2;

/**
 * Animal générique, racine de la hiérarchie des animaux.
 *
 * @author Berkay
 * @version 0.1.0
 */

public class Animal {

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

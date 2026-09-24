package tp2;

public class Test {

    public static void main(String[] args) {
        Plante plante = new Plante("Chêne", 1500.0);
        Animal animal = new Animal("Bestiole", 2);
        Mammifere mammifere = new Mammifere("Baleine", 30, 365);
        Oiseau oiseau = new Oiseau("Moineau", 1, 23.0);
        Chien chien = new Chien("Rex", 5, "Berger allemand");
        Lapin lapin = new Lapin("Panpan", 2, "blanc");
        Homme homme = new Homme("Martin", 35, "ingénieur");
        Aigle aigle = new Aigle("Aigle royal", 8, 220.0, 4000);

        Object[] objets = {plante, animal, mammifere, oiseau, chien, lapin, homme, aigle};
        for (Object o : objets) {
            System.out.println(o);
        }

        chien.aboyer();
        chien.allaiter();   // héritée de Mammifere
        aigle.pondre();     // héritée d'Oiseau
        aigle.chasser();
        homme.travailler();
        lapin.bondir();
    }
}
import couplage_faible.IMoteur;
import couplage_faible.Moteur_V2;
import couplage_faible.Moteur;
import couplage_faible.Voiture;

void main() {
    // ##### couplage fort #####
    // import couplage_fort.Voiture;
    // Voiture voiture = new Voiture();
    // IO.println(voiture.getPuissance());

    // ##### couplage faible #####
    Voiture voiture = new Voiture();
    IMoteur moteur1 = new Moteur();
    voiture.setMoteur(moteur1);
    IO.println(voiture.getPuissance());

    IMoteur moteur2 = new Moteur_V2();
    voiture.setMoteur(moteur2);
    IO.println(voiture.getPuissance());

    // Conclusion:
    // couplage fort: porter des modifications dans la structure des classes
    // couplage faible: porter des modifications dans l'instanciation en créant
    // de nouvelles classes qui implémentent une intérface
}

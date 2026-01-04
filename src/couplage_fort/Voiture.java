package couplage_fort;

// Une simple modification du moteur induit tout ces modifications
// Supposons que la classe contient plusieurs attributs et bien plus de fonctions
public class Voiture {
    // private Moteur moteur;
    private Moteur_V2 moteur;
    // public Voiture(){ this.moteur = new Moteur(); }
    public Voiture(){ this.moteur = new Moteur_V2(); }
    // public Moteur getMoteur(){ return moteur; }
    public Moteur_V2 getMoteur(){ return moteur; }
    // public void setMoteur(Moteur moteur){ this.moteur = moteur; }
    public void setMoteur(Moteur_V2 moteur){ this.moteur = moteur; }
    public double getPuissance(){
        return moteur.getPuissanceTotale();
    }
}

package couplage_faible;

public class Voiture {
    private IMoteur moteur;
    public Voiture(){}
    public IMoteur getMoteur(){ return moteur; }
    public void setMoteur(IMoteur moteur){ this.moteur = moteur; }
    public double getPuissance(){
        return moteur.getPuissanceTotale();
    }

}

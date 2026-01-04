package couplage_fort;

public class Moteur_V2 {
    private double puissance=10;
    private double tauxTurbo=.2;
    public double getPuissance(){
        return puissance;
    }
    public void setPuissance(double puissance){
        this.puissance = puissance;
    }
    public double getTauxTurbo(){
        return tauxTurbo;
    }
    public void setTauxTurbo(double tauxTurbo){
        this.tauxTurbo = tauxTurbo;
    }
    public double getPuissanceTotale(){
        return puissance*(1+tauxTurbo);
    }
}

package couplage_fort;

public class Moteur {
    private double puissance = 10;
    public double getPuissance(){ return this.puissance; }
    public void setPuissance(double puissance){
        this.puissance = puissance;
    }
    public double getPuissanceTotale(){
        return this.puissance;
    }
}

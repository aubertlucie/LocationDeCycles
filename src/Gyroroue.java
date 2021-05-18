import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {
    private static final double TARIF_GYROROUE = 18.90;

    //Constructeur
    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat, autonomie);
    }

    //Methode générée via methode abstraote tarif de cycle
    @Override
    public double getTarif() {
        return TARIF_GYROROUE;
    }
}

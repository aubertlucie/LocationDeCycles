import java.time.LocalDate;

/**
 * Gyropode
 * tailleMinimale en centimètres
 */

public class Gyropode extends CycleElectrique{
    private static final double TARIF_GYROPODE = 29.90;
    private int tailleMinimale;


    //Constructeur
    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMinimale) {
        super(marque, modele, dateAchat, autonomie);
        this.tailleMinimale = tailleMinimale;
    }

    //Methode générée via methode abstraote tarif de cycle
    @Override
    public double getTarif() {
        return TARIF_GYROPODE;
    }
}

import java.time.LocalDate;

public class Velo extends Cycle {
    private static final double TARIF_VELO = 4.90;
    private int nbVitesses;

    //Constructeur
    public Velo(String marque, String modele, LocalDate dateAchat, int nbVitesses) {
        super(marque, modele, dateAchat);
        this.nbVitesses = nbVitesses;
    }


    //Methode générée via methode abstraote tarif de cycle
    @Override
    public double getTarif() {
        return TARIF_VELO;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", age=" + super.age() + "an" + (super.age() > 1 ? "s" : "") + //pour mettre un "s" que si l'age est > à 1 an
                ", nbVitesses=" + nbVitesses +
                ", tarif=" + this.getTarif() + " €" +
                '}';
        //return String.format("%s %n %s %s", this.marque.......);
    }
}

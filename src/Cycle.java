
import java.time.LocalDate;


public abstract class Cycle {
    protected String marque;
    protected String modele;
    protected LocalDate dateAchat;


    //methode pour l'age
    public int age(){
        return this.dateAchat.until(LocalDate.now()).getYears();
    }

    //methode abstraite pour l'utiliser dans chaque classe qui utilise tarif
    public abstract double getTarif();

    //Constructeur --on commence par lui pour que les "super" se mettent dans les constructeurs des classes enfants
        public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }
}


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycle[] aLouer = new Cycle[6];
        Velo lapierre = new Velo("Lapierre", "speed 400", LocalDate.of(2020,6,21), 27);
        aLouer[0] = lapierre;
        /*Cycle[] aLouerSenior = { --ça c'est la version expérimentée qui prend moins de place
                new Velo("Lapierre", "speed 400", LocalDate.of(2020,6,21), 27)
        };*/

        /*for (Cycle cycle : aLouer) { --foreach pareil que fori
            if (cycle != null) {
                System.out.println(cycle);
            }
        }*/

        for (int i = 0; i < aLouer.length; i++) {
            if (aLouer[i] != null) {
                System.out.println(aLouer[i]);
            }
        }

    }
}

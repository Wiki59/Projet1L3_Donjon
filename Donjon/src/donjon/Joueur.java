package donjon;

/**
 * Le personnage joueur
 */
public class Joueur extends Personnage {

    /**
     * La salle ou se trouve le joueur
     */
    private Salle salle;

    public Joueur() {
        super("Bob");
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

}

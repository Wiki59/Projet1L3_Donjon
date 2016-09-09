package donjon;

/**
 * Un personnage du jeu, jouable ou non
 */
public class Personnage {

    private String nom = "Bob";

    private int force = 40;

    private int hp = 100;

    private boolean neutre = true;

    private Personnage() {
    }

    /**
     * Créer un personnage basique par son nom
     *
     * @param nom
     */
    public Personnage(String nom) {
        this.nom = nom;
    }

    /**
     * Créer un personnage plus poussé
     *
     * @param nom
     * @param force
     * @param hp
     */
    public Personnage(String nom, int force, int hp) {
        this.nom = nom;
        this.force = force;
        this.hp = hp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isNeutre() {
        return neutre;
    }

    public void setNeutre(boolean neutre) {
        this.neutre = neutre;
    }

}

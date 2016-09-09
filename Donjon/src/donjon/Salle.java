package donjon;

/**
 * Une salle du donjon pouvant contenir des monstres, des objets et voir bien
 * plus..
 */
public class Salle {

    /**
     * Le type de la salle : -1 : Entrée 0 : Basique 1 : Sortie
     */
    private int type = 0;

    /**
     * Si un couloir vers le haut existe
     */
    private boolean couloirHaut = false;

    /**
     * Si un couloir vers le haut existe
     */
    private boolean couloirGauche = false;

    /**
     * Si un couloir vers le haut existe
     */
    private boolean couloirDroite = false;

    /**
     * Si un couloir vers le haut existe
     */
    private boolean couloirBas = false;

    public Salle() {
    }

    /**
     * Type, -1 Entrée, 1 Sortie, si non laisser par défaut 0
     *
     * @param type
     */
    public Salle(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isCouloirHaut() {
        return couloirHaut;
    }

    public void setCouloirHaut(boolean couloirHaut) {
        this.couloirHaut = couloirHaut;
    }

    public boolean isCouloirGauche() {
        return couloirGauche;
    }

    public void setCouloirGauche(boolean couloirGauche) {
        this.couloirGauche = couloirGauche;
    }

    public boolean isCouloirDroite() {
        return couloirDroite;
    }

    public void setCouloirDroite(boolean couloirDroite) {
        this.couloirDroite = couloirDroite;
    }

    public boolean isCouloirBas() {
        return couloirBas;
    }

    public void setCouloirBas(boolean couloirBas) {
        this.couloirBas = couloirBas;
    }
    
    
}

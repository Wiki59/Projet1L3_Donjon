package donjon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La carte du jeu compléte
 */
public class Carte {

    /**
     * La source de la map
     */
    private String dmSource = "";

    /**
     * La map enregistré dans un tableau à 2 dimensions
     */
    private ArrayList<char[]> mapTab = new ArrayList<>();

    public Carte(String source) {
        this.dmSource = source;
        String ligne;
        try {
            BufferedReader ficTexte = new BufferedReader(new FileReader(new File(dmSource)));
            do {
                ligne = ficTexte.readLine();
                if (ligne != null) {
                    mapTab.add(ligne.toCharArray());
                }
            } while (ligne != null);
            /* Test visuel
             for (char[] cT : mapTab) {
             for (char c: cT) {
             System.out.print(c);
             }
             System.out.println("");
             }
             */
            ficTexte.close();
        } catch (IOException ex) {
            System.out.println("Une erreuur s'est produite lors de la lecture de la carte du jeu\n");
            System.out.println("Erreur : " + ex.getMessage());
        }
    }

    // A tester
    /**
     * Indique si la salle a une salle a sa gauche
     *
     * @param x
     * @param y
     * @return
     */
    public boolean hasLeft(int x, int y) {
        if (x - 1 < 0 || mapTab.get(y)[x - 1] == '0') {
            return false;
        }
        return true;
    }

    /**
     * Indique si la salle a une salle a sa droite
     *
     * @param x
     * @param y
     * @return
     */
    public boolean hasRigth(int x, int y) {
        if (x + 1 > mapTab.get(y).length || mapTab.get(y)[x + 1] == '0') {
            return false;
        }
        return true;
    }

    /**
     * Indique si la salle a une salle au dessus
     *
     * @param x
     * @param y
     * @return
     */
    public boolean hasTop(int x, int y) {
        if (y - 1 < 0 || mapTab.get(y - 1)[x] == '0') {
            return false;
        }
        return true;
    }

    /**
     * Indique si la salle a une salle en dessous
     *
     * @param x
     * @param y
     * @return
     */
    public boolean hasBot(int x, int y) {
        if (y + 1 < mapTab.size() || mapTab.get(y + 1)[x] == '0') {
            return false;
        }
        return true;
    }

    public String getDmSource() {
        return dmSource;
    }

    public void setDmSource(String dmSource) {
        this.dmSource = dmSource;
    }

    public ArrayList<char[]> getMapTab() {
        return mapTab;
    }

    public void setMapTab(ArrayList<char[]> mapTab) {
        this.mapTab = mapTab;
    }
    
    
}

package donjon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
    private int[][] mapTab;

    public Carte(String source) {
        this.dmSource = source;
        String ligne;
        try {
            BufferedReader ficTexte = new BufferedReader(new FileReader(new File(dmSource)));
            do {
                ligne = ficTexte.readLine();
                if (ligne != null) {
                    System.out.println(ligne);
                }
            } while (ficTexte != null);
            ficTexte.close();
        } catch (IOException ex) {
            System.out.println("Une erreuur s'est produite lors de la lecture de la carte du jeu\n");
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
}

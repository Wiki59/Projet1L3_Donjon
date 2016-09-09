package donjon;

import java.util.Scanner;
import static donjon.Constante.*;

/**
 * Classe de démarrage du jeu
 */
public class Donjon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour et bienvenue dans \"Cortex must die !\"");
        System.out.println("Choisissez un nom :");
        Scanner scan = new Scanner(System.in);
        joueur.set = scan.next();
        System.out.println("Bien " + nom + " commençon le jeu");
        
        // Demarrage
        salleActuel = new Salle(-1);
        
        // Boucle
        
    }

}

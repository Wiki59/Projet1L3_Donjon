package donjon;

import java.util.Scanner;

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
        String nom = scan.next();
        System.out.println("Donc tu t'appelles " + nom);
    }

}

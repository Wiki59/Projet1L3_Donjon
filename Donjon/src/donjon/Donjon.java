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
        joueur.setNom(scan.next());
        System.out.println("Bien " + joueur.getNom() + " commençons le jeu.\n");

        // Demarrage
        joueur.setSalle(new Salle(2));
        System.out.println("Vous vous réveillez silencieusement de votre tombe, insomniaque, vous ne savez pas où vous étes, mais une odeur plane dans l'air.");
        System.out.println("Vous regardez la tombe et vous voyez votre nom écrit sur une dalle en pierre posée à vos pieds, l'odeur devient plus en plus goûtante.");
        System.out.println("Devant vous se trouve une porte et des hiéroglyphique sont dessinés sur les murs, votre ventre grogne et vous savez que vous devais");
        System.out.println("suivre cette odeur qui vous gorge votre esprit.");
        System.out.println("");
        carte = new Carte("src/donjon/map.dm");
        
        System.out.println(carte.toString());
        
        tour();
    }

    public static void tour() {
        Salle salleActuel = joueur.getSalle();
        int typeSalle = salleActuel.getType();
        switch (typeSalle) {
            case 2:
                System.out.println("Vous étes à l'entrée");
                break;
            case 3:
                System.out.println("Vous avez atteint la sortie");
        }
        System.out.println("Que voulez vous faire :");
        System.out.println("Bouger (B)");
        if (true) {
            System.out.println("Combattre (C)");
        }
        if (true) {
            System.out.println("Utiliser un objet (O)");
        }
    }

}

// Classe principale pour tester la classe Voiture
public class Automobile {
    
    // Méthode principale du programme
    public static void main(String[] args) {
        
        // Création de voiture1 avec le constructeur par défaut
        Voiture voiture1 = new Voiture();
        System.out.println("Voiture 1 (constructeur par défaut) :");
        voiture1.afficher();
        System.out.println();
        
        // Création de voiture2 avec le constructeur d'initialisation
        Voiture voiture2 = new Voiture("Toyota", "Corolla", "CH123456", 5);
        System.out.println("Voiture 2 (constructeur d'initialisation) :");
        voiture2.afficher();
        System.out.println();
        
        // Création de voiture3 avec le constructeur de copie (copie de voiture2)
        Voiture voiture3 = new Voiture(voiture2);
        System.out.println("Voiture 3 (constructeur de copie) :");
        voiture3.afficher();
        System.out.println();
        
        // Exercice 1.3 : Création de voiture4 à partir de voiture3 avec le constructeur de copie
        Voiture voiture4 = new Voiture(voiture3);
        System.out.println("Voiture 4 (copie de voiture3) :");
        voiture4.afficher();
        System.out.println();
        
        // Comparaison avec ==
        System.out.println("Comparaison avec == :");
        if (voiture3 == voiture4) {
            System.out.println("voiture3 == voiture4 est vrai");
        } else {
            System.out.println("voiture3 == voiture4 est faux");
        }
        
        // Comparaison avec estEgal
        System.out.println("Comparaison avec estEgal :");
        if (voiture3.estEgal(voiture4)) {
            System.out.println("voiture3.estEgal(voiture4) est vrai");
        } else {
            System.out.println("voiture3.estEgal(voiture4) est faux");
        }
        
        // Conclusion
        System.out.println();
        System.out.println("Conclusion :");
        System.out.println("Le comparateur == compare les références (adresses mémoire).");
        System.out.println("Même si les objets ont les mêmes valeurs, == retourne faux car ce sont deux objets différents.");
        System.out.println("La méthode estEgal() compare le contenu des objets (numéro de châssis).");
        System.out.println("Elle retourne vrai si les deux voitures ont le même numéro de châssis.");
        
    }
}
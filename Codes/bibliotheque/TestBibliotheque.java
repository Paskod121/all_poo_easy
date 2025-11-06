// Classe pour tester la classe Livre
public class TestBibliotheque {
    
    // Méthode principale
    public static void main(String[] args) {
        
        System.out.println("=== Test 1 : Création avec constructeur par défaut ===");
        Livre livre1 = new Livre();
        livre1.afficher();
        System.out.println();
        
        System.out.println("=== Test 2 : Création avec constructeur d'initialisation ===");
        Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, true);
        livre2.afficher();
        System.out.println();
        
        System.out.println("=== Test 3 : Création avec constructeur de copie ===");
        Livre livre3 = new Livre(livre2);
        livre3.afficher();
        System.out.println();
        
        System.out.println("=== Test 4 : Emprunter un livre ===");
        System.out.println("Avant emprunt :");
        livre2.afficher();
        System.out.println();
        livre2.emprunter();
        System.out.println("Après emprunt :");
        livre2.afficher();
        System.out.println();
        
        System.out.println("=== Test 5 : Retourner un livre ===");
        System.out.println("Avant retour :");
        livre2.afficher();
        System.out.println();
        livre2.retourner();
        System.out.println("Après retour :");
        livre2.afficher();
        
    }
}
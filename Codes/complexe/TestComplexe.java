// Classe pour tester la classe Complexe
public class TestComplexe {
    
    // Méthode principale
    public static void main(String[] args) {
        
        System.out.println("=== Création de nombres complexes ===");
        Complexe z1 = new Complexe(3, 4);
        Complexe z2 = new Complexe(1, 2);
        
        System.out.print("z1 = ");
        z1.afficher();
        System.out.print("z2 = ");
        z2.afficher();
        System.out.println();
        
        System.out.println("=== Test du conjugué ===");
        Complexe conjugueZ1 = z1.conjugue();
        System.out.print("Conjugué de z1 = ");
        conjugueZ1.afficher();
        System.out.println();
        
        System.out.println("=== Test du carré ===");
        Complexe carreZ1 = z1.carre();
        System.out.print("Carré de z1 = ");
        carreZ1.afficher();
        System.out.println();
        
        System.out.println("=== Test du module ===");
        double moduleZ1 = z1.module();
        System.out.println("Module de z1 = " + moduleZ1);
        System.out.println();
        
        System.out.println("=== Test de l'addition ===");
        Complexe somme = z1.plus(z2);
        System.out.print("z1 + z2 = ");
        somme.afficher();
        System.out.println();
        
        System.out.println("=== Test de la multiplication ===");
        Complexe produit = z1.fois(z2);
        System.out.print("z1 * z2 = ");
        produit.afficher();
        System.out.println();
        
        System.out.println("=== Test de la comparaison ===");
        Complexe z3 = new Complexe(3, 4);
        System.out.print("z1 = ");
        z1.afficher();
        System.out.print("z3 = ");
        z3.afficher();
        if (z1.estEgal(z3)) {
            System.out.println("z1 et z3 sont égaux");
        } else {
            System.out.println("z1 et z3 ne sont pas égaux");
        }
        
        if (z1.estEgal(z2)) {
            System.out.println("z1 et z2 sont égaux");
        } else {
            System.out.println("z1 et z2 ne sont pas égaux");
        }
        
    }
}
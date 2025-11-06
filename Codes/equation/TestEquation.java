// Classe pour tester la classe EquationSecondDegre
public class TestEquation {
    
    // Méthode principale
    public static void main(String[] args) {
        
        System.out.println("=== Test 1 : Équation avec deux solutions ===");
        // Équation : x² - 5x + 6 = 0 (solutions : x = 2 et x = 3)
        EquationSecondDegre eq1 = new EquationSecondDegre(1, -5, 6);
        eq1.afficher();
        eq1.resoudre();
        System.out.println();
        
        System.out.println("=== Test 2 : Équation avec une solution double ===");
        // Équation : x² - 4x + 4 = 0 (solution : x = 2)
        EquationSecondDegre eq2 = new EquationSecondDegre(1, -4, 4);
        eq2.afficher();
        eq2.resoudre();
        System.out.println();
        
        System.out.println("=== Test 3 : Équation sans solutions réelles ===");
        // Équation : x² + x + 1 = 0 (pas de solutions réelles)
        EquationSecondDegre eq3 = new EquationSecondDegre(1, 1, 1);
        eq3.afficher();
        eq3.resoudre();
        
    }
}
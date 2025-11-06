// Classe pour représenter et résoudre une équation du second degré
// Forme : ax² + bx + c = 0 (avec a différent de 0)
public class EquationSecondDegre {
    
    // Attributs privés pour les coefficients de l'équation
    private double a;  // Coefficient de x²
    private double b;  // Coefficient de x
    private double c;  // Terme constant
    
    // Constructeur par défaut
    public EquationSecondDegre() {
        a = 0;
        b = 0;
        c = 0;
    }
    
    // Constructeur d'initialisation
    public EquationSecondDegre(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Méthode pour afficher l'équation
    public void afficher() {
        System.out.println("Équation : " + a + "x² + " + b + "x + " + c + " = 0");
    }
    
    // Méthode privée pour calculer le discriminant
    // Le discriminant se calcule avec la formule : Δ = b² - 4ac
    private double getDiscriminant() {
        double discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }
    
    // Méthode privée pour savoir si l'équation admet des solutions
    // L'équation admet des solutions si le discriminant est positif ou nul
    private boolean admetSolution() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Méthode pour résoudre l'équation et afficher le résultat
    public void resoudre() {
        // On vérifie d'abord si a est différent de 0
        if (a == 0) {
            System.out.println("Erreur : a doit être différent de 0");
            return;
        }
        
        // On calcule le discriminant
        double delta = getDiscriminant();
        System.out.println("Discriminant Δ = " + delta);
        
        // On vérifie si l'équation admet des solutions
        if (admetSolution()) {
            if (delta > 0) {
                // Deux solutions distinctes
                // Formule : x1 = (-b - √Δ) / (2a) et x2 = (-b + √Δ) / (2a)
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("L'équation admet deux solutions distinctes :");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                // Une seule solution (discriminant = 0)
                // Formule : x = -b / (2a)
                double x = -b / (2 * a);
                System.out.println("L'équation admet une solution double :");
                System.out.println("x = " + x);
            }
        } else {
            // Pas de solutions réelles
            System.out.println("L'équation n'admet pas de solutions réelles.");
        }
    }
}
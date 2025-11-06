// Classe pour représenter un nombre complexe
// Un nombre complexe z = a + bi où a est la partie réelle et b la partie imaginaire
public class Complexe {
    
    // Attributs privés
    private double partieReelle;      // La partie réelle (a)
    private double partieImaginaire;  // La partie imaginaire (b)
    
    // Constructeur par défaut
    public Complexe() {
        partieReelle = 0;
        partieImaginaire = 0;
    }
    
    // Constructeur d'initialisation
    public Complexe(double partieReelle, double partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }
    
    // Accesseurs
    public double getPartieReelle() {
        return partieReelle;
    }
    
    public void setPartieReelle(double partieReelle) {
        this.partieReelle = partieReelle;
    }
    
    public double getPartieImaginaire() {
        return partieImaginaire;
    }
    
    public void setPartieImaginaire(double partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }
    
    // Méthode pour afficher un nombre complexe
    public void afficher() {
        if (partieImaginaire >= 0) {
            System.out.println(partieReelle + " + " + partieImaginaire + "i");
        } else {
            System.out.println(partieReelle + " - " + Math.abs(partieImaginaire) + "i");
        }
    }
    
    // Méthode pour calculer le conjugué d'un nombre complexe
    // Le conjugué de z = a + bi est z̄ = a - bi
    public Complexe conjugue() {
        Complexe resultat = new Complexe(partieReelle, -partieImaginaire);
        return resultat;
    }
    
    // Méthode pour calculer le carré d'un nombre complexe
    // Si z = a + bi, alors z² = (a² - b²) + (2ab)i
    public Complexe carre() {
        double nouvellePartieReelle = (partieReelle * partieReelle) - (partieImaginaire * partieImaginaire);
        double nouvellePartieImaginaire = 2 * partieReelle * partieImaginaire;
        Complexe resultat = new Complexe(nouvellePartieReelle, nouvellePartieImaginaire);
        return resultat;
    }
    
    // Méthode pour calculer le module d'un nombre complexe
    // Le module de z = a + bi est √(a² + b²)
    public double module() {
        double resultat = Math.sqrt((partieReelle * partieReelle) + (partieImaginaire * partieImaginaire));
        return resultat;
    }
    
    // Méthode pour additionner deux nombres complexes
    // Si z1 = a1 + b1i et z2 = a2 + b2i, alors z1 + z2 = (a1 + a2) + (b1 + b2)i
    public Complexe plus(Complexe autre) {
        double nouvellePartieReelle = this.partieReelle + autre.partieReelle;
        double nouvellePartieImaginaire = this.partieImaginaire + autre.partieImaginaire;
        Complexe resultat = new Complexe(nouvellePartieReelle, nouvellePartieImaginaire);
        return resultat;
    }
    
    // Méthode pour multiplier deux nombres complexes
    // Si z1 = a1 + b1i et z2 = a2 + b2i, alors z1 * z2 = (a1*a2 - b1*b2) + (a1*b2 + a2*b1)i
    public Complexe fois(Complexe autre) {
        double nouvellePartieReelle = (this.partieReelle * autre.partieReelle) - (this.partieImaginaire * autre.partieImaginaire);
        double nouvellePartieImaginaire = (this.partieReelle * autre.partieImaginaire) + (this.partieImaginaire * autre.partieReelle);
        Complexe resultat = new Complexe(nouvellePartieReelle, nouvellePartieImaginaire);
        return resultat;
    }
    
    // Méthode pour comparer deux nombres complexes
    // Deux nombres complexes sont égaux si leurs parties réelles et imaginaires sont égales
    public boolean estEgal(Complexe autre) {
        if (this.partieReelle == autre.partieReelle && this.partieImaginaire == autre.partieImaginaire) {
            return true;
        } else {
            return false;
        }
    }
}
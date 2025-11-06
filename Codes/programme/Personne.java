// Classe Personne qui représente une personne
public class Personne {
    
    // Attribut privé de la classe
    private String nom;  // Le nom de la personne
    
    // Constructeur par défaut (sans paramètres)
    public Personne() {
        nom = "";
    }
    
    // Accesseur en lecture (getter) pour le nom
    public String getNom() {
        return nom;
    }
    
    // Accesseur en modification (setter) pour le nom
    public void setNom(String nouveauNom) {
        nom = nouveauNom;
    }
    
    // Méthode pour afficher les données d'une personne
    public void afficher() {
        System.out.println("Nom : " + nom);
    }
}


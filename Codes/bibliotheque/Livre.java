// Classe Livre pour représenter un livre dans une bibliothèque
public class Livre {
    
    // Attributs privés de la classe Livre
    private String titre;           // Le titre du livre
    private String auteur;          // L'auteur du livre
    private int anneePublication;   // L'année de publication
    private boolean disponible;     // Indique si le livre est disponible ou emprunté
    
    // Constructeur par défaut (sans paramètres)
    public Livre() {
        titre = "";
        auteur = "";
        anneePublication = 0;
        disponible = true;  // Par défaut, un livre est disponible
    }
    
    // Constructeur d'initialisation (avec paramètres)
    public Livre(String titre, String auteur, int anneePublication, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
    }
    
    // Constructeur de copie (prend un autre Livre en paramètre)
    public Livre(Livre autreLivre) {
        this.titre = autreLivre.titre;
        this.auteur = autreLivre.auteur;
        this.anneePublication = autreLivre.anneePublication;
        this.disponible = autreLivre.disponible;
    }
    
    // Méthode pour afficher les informations du livre
    public void afficher() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Année de publication : " + anneePublication);
        if (disponible) {
            System.out.println("Disponible : Oui");
        } else {
            System.out.println("Disponible : Non");
        }
    }
    
    // Méthode pour emprunter un livre (marque comme non disponible)
    public void emprunter() {
        disponible = false;
    }
    
    // Méthode pour retourner un livre (marque comme disponible)
    public void retourner() {
        disponible = true;
    }
    
    // Accesseurs (getters et setters) pour les attributs
    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getAuteur() {
        return auteur;
    }
    
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public int getAnneePublication() {
        return anneePublication;
    }
    
    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
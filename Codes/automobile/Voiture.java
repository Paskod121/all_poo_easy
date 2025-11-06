// Classe Voiture qui représente une voiture
public class Voiture {
    
    // Attributs privés de la classe Voiture
    private String marque;           // La marque de la voiture
    private String modele;           // Le modèle de la voiture
    private String couleur;          // La couleur de la voiture
    private String numeroDeChassis; // Le numéro de châssis
    private int nombreDePlaces;     // Le nombre de places dans la voiture
    
    // Constructeur par défaut (sans paramètres)
    public Voiture() {
        // On initialise les attributs avec des valeurs par défaut
        marque = "";
        modele = "";
        couleur = "";
        numeroDeChassis = "";
        nombreDePlaces = 0;
    }
    
    // Constructeur d'initialisation (avec paramètres)
    public Voiture(String marque, String modele, String numeroDeChassis, int nombreDePlaces) {
        // On initialise les attributs avec les valeurs passées en paramètres
        this.marque = marque;
        this.modele = modele;
        this.numeroDeChassis = numeroDeChassis;
        this.nombreDePlaces = nombreDePlaces;
        // La couleur n'est pas passée en paramètre, on laisse vide
        this.couleur = "";
    }
    
    // Constructeur de copie (prend une autre Voiture en paramètre)
    public Voiture(Voiture autreVoiture) {
        // On copie tous les attributs de l'autre voiture
        this.marque = autreVoiture.marque;
        this.modele = autreVoiture.modele;
        this.couleur = autreVoiture.couleur;
        this.numeroDeChassis = autreVoiture.numeroDeChassis;
        this.nombreDePlaces = autreVoiture.nombreDePlaces;
    }
    
    // Méthode pour afficher les informations d'une voiture
    public void afficher() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Numéro de châssis : " + numeroDeChassis);
        System.out.println("Nombre de places : " + nombreDePlaces);
    }
    
    // Accesseur en lecture (getter) pour la marque
    public String getMarque() {
        return marque;
    }
    
    // Accesseur en modification (setter) pour la marque
    public void setMarque(String nouvelleMarque) {
        marque = nouvelleMarque;
    }
    
    // Accesseur en lecture (getter) pour le modèle
    public String getModele() {
        return modele;
    }
    
    // Accesseur en modification (setter) pour le modèle
    public void setModele(String nouveauModele) {
        modele = nouveauModele;
    }
    
    // Accesseur en lecture (getter) pour la couleur
    public String getCouleur() {
        return couleur;
    }
    
    // Accesseur en modification (setter) pour la couleur
    public void setCouleur(String nouvelleCouleur) {
        couleur = nouvelleCouleur;
    }
    
    // Accesseur en lecture (getter) pour le numéro de châssis
    public String getNumeroDeChassis() {
        return numeroDeChassis;
    }
    
    // Accesseur en modification (setter) pour le numéro de châssis
    public void setNumeroDeChassis(String nouveauNumeroDeChassis) {
        numeroDeChassis = nouveauNumeroDeChassis;
    }
    
    // Accesseur en lecture (getter) pour le nombre de places
    public int getNombreDePlaces() {
        return nombreDePlaces;
    }
    
    // Accesseur en modification (setter) pour le nombre de places
    public void setNombreDePlaces(int nouveauNombreDePlaces) {
        nombreDePlaces = nouveauNombreDePlaces;
    }
    
    // Méthode pour comparer deux voitures
    public boolean estEgal(Voiture autreVoiture) {
        // On compare le numéro de châssis car c'est unique
        // Si les deux numéros de châssis sont identiques, les voitures sont identiques
        if (this.numeroDeChassis.equals(autreVoiture.numeroDeChassis)) {
            return true;
        } else {
            return false;
        }
    }
}
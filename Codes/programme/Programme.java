// Classe principale pour tester la notion de référence
public class Programme {
    
    // Méthode principale du programme
    public static void main(String[] args) {
        
        // Création d'un objet Personne avec le constructeur par défaut
        Personne p1 = new Personne();
        p1.setNom("KOFFI");
        p1.afficher();
        
        // p2 pointe vers le même objet que p1
        Personne p2 = p1;
        p2.setNom("KODJO");
        p2.afficher();
        
        // On affiche aussi p1 pour voir ce qui s'est passé
        System.out.println("Affichage de p1 après modification de p2 :");
        p1.afficher();
        
        // Explication :
        // p1 et p2 pointent vers le même objet en mémoire
        // Donc quand on modifie p2, on modifie aussi p1
        // Parce que c'est le même objet !
        
    }
}


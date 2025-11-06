# Guide d'interrogation – POO Java (version simple)

Objectif: pouvoir répondre calmement aux questions du prof sur le code écrit. Tout est expliqué avec des mots simples et des exemples.

---

## 0) Rappels très courts
- **Classe**: plan de construction d'objet (attributs + méthodes).
- **Objet**: chose concrète créée à partir d'une classe (avec `new`).
- **Attribut**: variable qui stocke un état (ex: `marque`).
- **Méthode**: action/fonction (ex: `afficher()`).
- **Constructeur**: méthode spéciale qui initialise l'objet.
- **Encapsulation**: attributs en `private` + getters/setters pour contrôler l'accès.
- **Référence**: une variable d'objet contient l'adresse de l'objet en mémoire.
- **== vs estEgal()**: `==` compare les adresses; `estEgal()` compare le contenu qu'on a décidé.

---

## 1) Projet `automobile`
Fichiers: `Voiture.java`, `Automobile.java`.

### 1.1 `Voiture.java` – idées principales
- Attributs privés: `marque`, `modele`, `couleur`, `numeroDeChassis`, `nombreDePlaces`.
- 3 constructeurs:
  - **Par défaut**: met des valeurs simples (vides/0). Utilité: pouvoir créer une voiture sans info au début.
  - **D'initialisation**: on passe les infos principales en paramètres. Rapide pour créer un objet prêt.
  - **De copie**: crée une nouvelle voiture en copiant toutes les valeurs d'une autre.
- Méthode `afficher()`: affiche chaque attribut ligne par ligne.
- Getters/Setters: lecture et modification contrôlées de chaque attribut.
- `estEgal(Voiture v)`: je décide que deux voitures sont identiques si leur `numeroDeChassis` est le même (c'est un identifiant unique).

### 1.2 Questions possibles (avec réponses courtes)
- Q: Pourquoi les attributs sont `private` ?
  - R: Pour protéger les données (encapsulation). On passe par getters/setters.
- Q: À quoi sert le mot-clé `this` ?
  - R: Il désigne l'objet courant. J'en ai besoin quand le nom du paramètre est le même que l'attribut.
- Q: Pourquoi la couleur n'est pas passée dans le constructeur d'initialisation ?
  - R: Par choix pédagogique. On montre qu'on peut la régler plus tard via `setCouleur()`.
- Q: Que compare `estEgal()` ?
  - R: Le numéro de châssis. S'il est identique, je retourne `true`.
- Q: Différence entre `==` et `estEgal()` ?
  - R: `==` compare les adresses mémoire (références). `estEgal()` compare le contenu que j'ai défini.

### 1.3 `Automobile.java` – déroulé du `main`
- Crée `voiture1` avec le constructeur par défaut et affiche.
- Crée `voiture2` avec le constructeur d'initialisation et affiche.
- Crée `voiture3` en copiant `voiture2` et affiche.
- Crée `voiture4` en copiant `voiture3` et affiche.
- Compare `voiture3` et `voiture4` avec `==` (souvent faux, objets différents) puis avec `estEgal()` (vrai si même numéro de châssis).
- Conclut à l'oral: `==` compare les références; `estEgal()` compare le contenu choisi.

### 1.4 Pièges classiques à éviter
- Oublier d'initialiser des attributs dans les constructeurs.
- Comparer deux `String` par `==` au lieu de `.equals(...)`.
- Changer l'identifiant unique après la création (mieux d'éviter dans un vrai projet).

---

## 2) Projet `programme` (notion de référence)
Fichiers: `Personne.java`, `Programme.java`.

### 2.1 Idée clé
```
Personne p1 = new Personne();
Personne p2 = p1; // p2 pointe le même objet que p1
```
- Si je fais `p2.setNom("KODJO")`, alors `p1.afficher()` montre aussi `KODJO` parce que c'est le **même objet** en mémoire.

### 2.2 Questions possibles
- Q: Pourquoi p1 et p2 affichent la même valeur ?
  - R: Ce sont deux **références** vers **le même objet**.
- Q: Comment faire une vraie copie indépendante ?
  - R: Créer un **nouvel objet** et copier les champs (ex: un constructeur de copie).

---

## 3) Projet `equation`
Fichiers: `EquationSecondDegre.java`, `TestEquation.java`.

### 3.1 Méthodes importantes
- `afficher()`: montre l'équation `ax² + bx + c = 0`.
- `getDiscriminant()` (privée): calcule Δ = b² − 4ac.
- `admetSolution()` (privée): vrai si Δ ≥ 0.
- `resoudre()`: cas Δ > 0 (2 solutions), Δ = 0 (1 solution double), Δ < 0 (aucune solution réelle). Vérifie aussi `a != 0`.

### 3.2 Questions possibles
- Q: Pourquoi `getDiscriminant()` est privée ?
  - R: Détail interne de calcul, utilisé en interne seulement.
- Q: Et si `a == 0` ?
  - R: Ce n'est plus une équation du second degré; le code affiche une erreur simple.

---

## 4) Projet `complexe`
Fichiers: `Complexe.java`, `TestComplexe.java`.

### 4.1 Méthodes
- `conjugue()`, `carre()`, `module()`, `plus(autre)`, `fois(autre)`, `estEgal(autre)`.
- Chaque opération crée un **nouvel objet** pour éviter de modifier l'original (plus simple à expliquer).

### 4.2 Questions possibles
- Q: Formule du produit de deux complexes ?
  - R: `(a1*a2 − b1*b2) + (a1*b2 + a2*b1)i`.
- Q: Pourquoi `estEgal()` ne compare pas des doubles avec une marge ?
  - R: Pour un exercice simple, on reste sur l'égalité directe.

---

## 5) Projet `bibliotheque`
Fichiers: `Livre.java`, `TestBibliotheque.java`.

### 5.1 Idées
- `emprunter()` met `disponible = false`, `retourner()` le remet à `true`.
- `afficher()` montre l'état courant du livre.

### 5.2 Questions possibles
- Q: Pourquoi un constructeur de copie ?
  - R: Pour dupliquer facilement un livre existant avec les mêmes valeurs.

---

## 6) Comment compiler et exécuter (ligne de commande)
Depuis le dossier `Codes` :
```
javac automobile/*.java programme/*.java equation/*.java complexe/*.java bibliotheque/*.java
java automobile.Automobile
java programme.Programme
java equation.TestEquation
java complexe.TestComplexe
java bibliotheque.TestBibliotheque
```

---

## 7) Erreurs fréquentes du débutant
- Utiliser `==` pour comparer des `String` (il faut `.equals`).
- Oublier d'initialiser des attributs dans un constructeur.
- Modifier l'objet passé en paramètre sans s'en rendre compte (d'où création d'objets nouveaux dans les méthodes mathématiques).

---

## 8) Glossaire très court
- Objet, Référence, Constructeur, Encapsulation, Getter/Setter, Discriminant, Conjugué, Module.

---

## 9) Mini check-list avant interrogation
- Expliquer chaque constructeur de `Voiture` et le rôle de `this`.
- Donner la différence `==` / `estEgal()` avec un exemple.
- Réciter Δ = b² − 4ac et les 3 cas de solutions.
- Écrire de tête la formule du produit de deux complexes.
- Expliquer simplement `emprunter()` et `retourner()`.

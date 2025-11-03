# CORRIGÉS - THÉORIES DES SYSTÈMES D'EXPLOITATION
**Licence Professionnelle GL & SRI - Semestre 3**  
**Année Universitaire 2024-2025**

---

## 📋 DEVOIR SURVEILLÉ N°1

### Question 1 : Position de l'OS dans un système informatique [1 pt]

```
┌──────────────────────────────────────┐
│          UTILISATEURS                │
└────────────────┬─────────────────────┘
                 │
┌────────────────▼─────────────────────┐
│         APPLICATIONS                 │
│   (Word, Chrome, Jeux, etc.)        │
└────────────────┬─────────────────────┘
                 │
┌────────────────▼─────────────────────┐
│    SYSTÈME D'EXPLOITATION (OS)       │
│  (Windows, Linux, Android, etc.)    │
│  • Gestion des ressources           │
│  • Interface matériel/logiciel      │
└────────────────┬─────────────────────┘
                 │
┌────────────────▼─────────────────────┐
│         MATÉRIEL (Hardware)          │
│  CPU • RAM • Disque • GPU • I/O     │
└──────────────────────────────────────┘
```

**Rôle clé** : L'OS est la couche intermédiaire assurant la communication entre le matériel et les applications.

---

### Question 2 : LOGICIEL vs APPLICATION [1 pt]

| Terme | Définition | Exemples |
|-------|------------|----------|
| **LOGICIEL** | Tout programme informatique (terme générique) | OS, pilotes, applications, firmware |
| **APPLICATION** | Logiciel spécifique pour l'utilisateur final | Microsoft Word, Chrome, Photoshop |

**Relation** : Toute application est un logiciel, mais tout logiciel n'est pas une application.

---

### Question 3 : PLUG AND PLAY [2 pts]

**Définition**  
Technologie permettant la reconnaissance et la configuration automatiques des périphériques matériels sans intervention manuelle.

**Principe**
- Détection automatique du périphérique
- Chargement automatique des pilotes
- Configuration automatique des ressources

**Sur les handheld computers**  
✅ **Oui**, le Plug and Play existe sur :
- Ordinateurs portables (USB, HDMI, Bluetooth)
- Smartphones/tablettes (écouteurs, cartes SD, accessoires USB-C)
- Exemple : Connexion d'un casque Bluetooth → détection et connexion automatiques

---

### Question 4 : CŒUR vs PROCESSEUR [2 pts]

**Évolution technologique**

| Époque | Concept | Caractéristiques |
|--------|---------|------------------|
| **Avant 2000** | 1 processeur = 1 cœur | Augmentation de la fréquence (MHz → GHz) |
| **Après 2005** | 1 processeur = N cœurs | Multi-core (dual, quad, octa-core, etc.) |

**Raisons de cette évolution**
1. **Limite physique** : Impossible d'augmenter indéfiniment la fréquence (problème de chaleur)
2. **Parallélisme réel** : Plusieurs tâches exécutées simultanément
3. **Efficacité énergétique** : Meilleure performance/watt
4. **Performances accrues** : Ex. quad-core 2.5 GHz > single-core 3.5 GHz pour le multitâche

---

### Question 5 : Multitâches et Multiutilisateurs [2 pts]

**Définitions**

- **Multitâches** : Capacité d'exécuter plusieurs processus simultanément (ou en pseudo-simultané)
- **Multiutilisateurs** : Capacité de gérer plusieurs utilisateurs connectés en même temps

**Rapport entre les deux**

```
┌────────────────────────────────────┐
│      MULTIUTILISATEUR              │
│                                    │
│  ┌──────────┐      ┌──────────┐  │
│  │ User A   │      │ User B   │  │
│  │ • Task 1 │      │ • Task 3 │  │
│  │ • Task 2 │      │ • Task 4 │  │
│  └──────────┘      └──────────┘  │
│                                    │
│        MULTITÂCHE                  │
└────────────────────────────────────┘
```

**Conclusion** : 
- Multiutilisateur **implique** multitâche (chaque utilisateur lance ses tâches)
- Multitâche **n'implique pas** multiutilisateur (un seul utilisateur peut lancer plusieurs programmes)

---

### Question 6 : SPOOLING [2 pts]

**Définition**  
**SPOOLING** = **S**imultaneous **P**eripheral **O**perations **O**n-**Line**

Technique de gestion où les données destinées à un périphérique lent sont temporairement stockées sur disque avant traitement.

**Fonctionnement**
```
Programme → Données → SPOOL (Disque) → File d'attente → Imprimante
```

**Dispositif ayant précipité son avènement**  
🖨️ **L'IMPRIMANTE**

**Raison** : L'imprimante est extrêmement lente comparée au CPU. Sans spooling, le CPU devait attendre la fin de l'impression. Avec le spooling, les données vont dans une file d'attente sur disque et le CPU continue son travail.

---

### Question 7 : Ontogenèse et Phylogenèse [2 pts]

**Citation biologique** : "L'ontogenèse résume la phylogenèse"  
*Le développement individuel récapitule l'évolution de l'espèce*

**Application à l'informatique**

| Ontogenèse (Individu) | Phylogenèse (Histoire) |
|----------------------|------------------------|
| Apprentissage d'un étudiant | Évolution de l'informatique |

**Exemples concrets**

1. **Apprentissage programmation**
   - Étudiant : Basic → C → Java → Python
   - Histoire : Langages impératifs → Procéduraux → Orientés objet → Modernes

2. **Architecture des OS**
   - Système moderne : Boot → Mode batch → Multi-tâche → Temps réel
   - Histoire : Batch systems → Time-sharing → Multi-processing → Real-time

3. **Évolution personnelle**
   - Développeur : Console → Interface graphique → Web → Mobile
   - Industrie : Mainframes → PC → Internet → Smartphones

---

### Question 8 : INTERFACE UTILISATEUR [2 pts]

**Définition**  
Ensemble des moyens par lesquels l'utilisateur interagit avec le système (entrées) et reçoit des informations (sorties).

**Évolution historique**

| Génération | Type | Caractéristiques |
|------------|------|------------------|
| 1950-1980 | **CLI** (Command Line) | Commandes textuelles (DOS, Unix) |
| 1980-2000 | **GUI** (Graphical) | Fenêtres, icônes, souris (Windows, Mac) |
| 2000-2010 | **Tactile** | Multi-touch, gestes (iPhone, Android) |
| 2010-2020 | **Vocale** | Assistants (Siri, Alexa, Google Assistant) |
| 2020+ | **Multimodale** | Combinaison de plusieurs modes |

**Évolution actuelle (tendances)**
- 🤖 **Interfaces conversationnelles IA** (ChatGPT, assistants intelligents)
- 🥽 **Réalité augmentée/virtuelle** (AR/VR - Vision Pro, Meta Quest)
- 🖐️ **Interfaces gestuelles** (Kinect, Leap Motion)
- 🧠 **Interfaces cerveau-machine** (Neuralink - expérimental)
- 🎨 **Design adaptatif** (s'ajuste au contexte et à l'utilisateur)

---

### Question 9 : Erreur de parité [1 pt]

**Définition**  
Mécanisme de détection d'erreurs en mémoire utilisant un **bit de parité** supplémentaire pour vérifier l'intégrité des données.

**Fonctionnement**
- Bit de parité ajouté pour que le nombre total de bits à 1 soit pair (parité paire) ou impair (parité impaire)
- Lors de la lecture, si la parité ne correspond pas → **erreur de parité** détectée
- Indique une corruption potentielle des données (rayonnement, défaillance matérielle)

**Note** : Détecte les erreurs mais ne les corrige pas (contrairement au code ECC).

---

### Question 10 : Protection et Sécurité [2 pts]

**Définitions**

| Concept | Définition | Focus |
|---------|------------|-------|
| **Protection** | Mécanismes internes contrôlant l'accès aux ressources | Menaces internes/erreurs |
| **Sécurité** | Défense contre les menaces et attaques | Menaces externes/malveillance |

**Mise en œuvre dans les OS**

**1. Protection**
- **Modes d'exécution** : Mode utilisateur ↔ Mode noyau (kernel)
- **Isolation mémoire** : Chaque processus a son espace mémoire protégé
- **Permissions fichiers** : Lecture (r), Écriture (w), Exécution (x)
- **Anneaux de protection** : Ring 0 (kernel) → Ring 3 (user)

**2. Sécurité**
- **Authentification** : Mots de passe, biométrie, 2FA
- **Contrôle d'accès** : ACL (Access Control Lists), groupes utilisateurs
- **Chiffrement** : Données en transit et au repos
- **Pare-feu** : Filtrage du trafic réseau
- **Antivirus/Antimalware** : Détection et prévention
- **Mises à jour** : Correctifs de sécurité

---

### Question 11 : Appels système [1 pt]

**Définition**  
Interface de programmation permettant aux applications en **mode utilisateur** de demander des services au **noyau** (mode privilégié).

**Fonction**
- Transition mode utilisateur → mode noyau
- Exécution d'opérations privilégiées
- Retour en mode utilisateur avec résultat

**Exemples d'appels système**
- `fork()` : Création de processus
- `open()`, `read()`, `write()` : Gestion fichiers
- `malloc()` : Allocation mémoire
- `socket()` : Communication réseau

---

### Question 12 : Processus - Concept et Cycle de vie [2 pts]

**Définition**  
Un **processus** est un programme en cours d'exécution, comprenant :
- Code exécutable
- Données (variables)
- Pile d'exécution (stack)
- Compteur ordinal (PC)
- Registres CPU
- Contexte d'exécution

**Cycle de vie des processus**

```
                    ┌──────────┐
                    │ NOUVEAU  │ ← Création
                    └─────┬────┘
                          │ Admission
                          ▼
              ┌───────────────────────┐
              │                       │
         ┌────┤        PRÊT          │
         │    │   (Ready Queue)      │
         │    └───────┬───────────────┘
         │            │ Dispatch/Élection
    Préemption        ▼
         │    ┌───────────────────────┐
         │    │                       │
         └────┤    EN EXÉCUTION      │
              │    (Running - CPU)    │
              └───┬───────────┬───────┘
                  │           │
         Attente  │           │ Terminaison
         E/S      │           │
                  ▼           ▼
         ┌────────────┐  ┌──────────┐
         │  BLOQUÉ    │  │ TERMINÉ  │ → Fin
         │ (Waiting)  │  │  (Exit)  │
         └────┬───────┘  └──────────┘
              │
              │ Événement accompli
              │ (E/S terminée)
              ▼
         Retour à PRÊT
```

**États expliqués**
- **Nouveau** : Processus en création
- **Prêt** : En attente d'allocation CPU
- **Exécution** : Utilise actuellement le CPU
- **Bloqué** : Attend un événement (E/S, ressource)
- **Terminé** : Exécution terminée

---
---

## 📝 EXAMEN DE SYNTHÈSE

### Question 1 : Citation de Silberschatz [2,5 pts]

**Citation** : *"Un système d'exploitation est une partie indispensable de presque tout système informatique."*

**Termes en relief**

**Système d'exploitation (OS)**
- Logiciel de base gérant les ressources matérielles
- Fournit des services aux applications
- Interface entre matériel et logiciel

**Système informatique**
- Ensemble cohérent : matériel + logiciels + utilisateurs
- Permet le traitement automatique de l'information

**Explication de l'affirmation**

L'OS est indispensable car il assure :

1. **Gestion des ressources**
   - Partage équitable du CPU, mémoire, périphériques
   - Évite les conflits entre programmes

2. **Abstraction du matériel**
   - Les applications n'interagissent pas directement avec le matériel
   - API standardisées (appels système)

3. **Protection et sécurité**
   - Isolation des processus
   - Contrôle d'accès aux ressources

4. **Efficacité**
   - Optimisation de l'utilisation des ressources
   - Multitâche, multiprogrammation

**Pourquoi "presque tout"** : Certains systèmes embarqués très simples n'ont pas d'OS formel (microcontrôleurs basiques), mais la majorité des systèmes informatiques modernes en nécessitent un.

---

### Question 2a : Évolution des systèmes informatiques [2,5 pts]

**Chronologie historique**

| Période | Génération | Caractéristiques principales |
|---------|------------|------------------------------|
| **1940s** | **Précurseurs** | • Machines électromécaniques<br>• ENIAC, UNIVAC<br>• Programmation par câblage<br>• Calcul balistique, scientifique |
| **1950-1960s** | **Mainframes** | • Ordinateurs centraux (IBM 701, 7090)<br>• Taille d'une pièce<br>• Très coûteux<br>• Systèmes batch<br>• Utilisés par grandes entreprises/gouvernements |
| **1970s** | **Miniordinateurs** | • Plus petits, moins chers<br>• DEC PDP-11, VAX<br>• Départements universitaires<br>• Time-sharing |
| **1980s** | **Micro-ordinateurs (PC)** | • Ordinateurs personnels<br>• Apple II, IBM PC, Commodore 64<br>• Interface graphique (Mac 1984)<br>• Usage domestique et professionnel |
| **1990s** | **Portables & Internet** | • Ordinateurs portables<br>• Connexion Internet généralisée<br>• Windows 95/98<br>• Mobilité accrue |
| **2000s** | **Convergence numérique** | • Laptops puissants<br>• Wi-Fi généralisé<br>• PDA (Palm, Pocket PC) |
| **2007+** | **Smartphones & Tablettes** | • iPhone (2007), Android (2008)<br>• iPad (2010)<br>• Convergence téléphonie + informatique<br>• Écrans tactiles<br>• Apps store<br>• Connectivité permanente (3G/4G/5G) |

**Tendances actuelles** : Cloud computing, IoT, wearables, edge computing

---

### Question 2b : Évolution des types d'OS [3 pts]

**Chronologie des types d'OS**

| Période | Type d'OS | Caractéristiques | Exemple dans Android |
|---------|-----------|------------------|----------------------|
| **1950s** | **Batch Systems**<br>(Systèmes par lots) | • Jobs groupés sans interaction<br>• Traitement séquentiel<br>• Optimisation du débit | • Tâches planifiées en arrière-plan<br>• Synchronisation automatique<br>• Mises à jour système nocturnes |
| **1960s** | **Multiprogramming** | • Plusieurs programmes en mémoire<br>• CPU partagé<br>• Amélioration utilisation ressources | • Multiples apps en RAM<br>• Changement de contexte rapide |
| **1960s-70s** | **Time-Sharing**<br>(Temps partagé) | • Plusieurs utilisateurs interactifs<br>• Quantum de temps CPU<br>• Illusion de possession exclusive | • Multiples apps actives<br>• Round-robin scheduling<br>• Réactivité UI |
| **1970s** | **Multiprocessing** | • Plusieurs CPU/cœurs<br>• Parallélisme réel<br>• Performances accrues | • Support multi-core (4/8 cœurs)<br>• Threads parallèles<br>• Big.LITTLE architecture |
| **1980s** | **Distributed Systems**<br>(Systèmes distribués) | • Ressources réparties sur réseau<br>• Transparence de localisation<br>• Communication inter-machines | • Services cloud intégrés<br>• Synchronisation multi-appareils<br>• APIs réseau |
| **1980s-90s** | **Real-Time Systems**<br>(Temps réel) | • Contraintes temporelles strictes<br>• Déterminisme<br>• Hard/Soft real-time | • Gestion appels téléphoniques<br>• Lecture audio/vidéo<br>• Traitement événements tactiles<br>• Latence garantie |
| **1990s** | **Network OS** | • Focus réseau<br>• Partage fichiers/imprimantes<br>• Client-serveur | • Stack TCP/IP complète<br>• VPN, hotspot, NFC<br>• APIs réseau riches |
| **2000s+** | **Mobile OS** | • Optimisation batterie<br>• Interface tactile<br>• Capteurs multiples<br>• Connectivité permanente<br>• App ecosystems | • Android lui-même !<br>• Power management agressif<br>• Senseurs (GPS, accéléromètre, etc.) |

**Synthèse pour Android**

Android intègre caractéristiques de :
- **Batch** : Tâches planifiées, jobs différés
- **Real-time** : Gestion téléphonie, multimédia
- **Time-sharing** : Multitâche interactif
- **Distributed** : Cloud, synchronisation
- **Mobile** : Optimisations spécifiques

---

### Question 3 : Point commun des termes [0,5 pt]

Ces termes désignent tous des **algorithmes de gestion de ressources système** utilisés par l'OS.

Plus précisément : ce sont des **politiques** ou **stratégies** d'allocation et d'ordonnancement.

---

### Question 4 : Nombre de groupes [0,5 pt]

**Réponse : 3 groupes**

---

### Question 5 : Nom des groupes [1,5 pts]

1. **Algorithmes d'ordonnancement du CPU** (CPU Scheduling Algorithms)

2. **Algorithmes d'allocation de mémoire contiguë** (Contiguous Memory Allocation Algorithms)

3. **Algorithmes de remplacement de pages** (Page Replacement Algorithms)

---

### Question 6 : Répartition des termes [1,5 pts]

**Groupe 1 : Ordonnancement CPU**
- FCFS (First-Come, First-Served)
- SJF (Shortest-Job-First)
- RR (Round Robin)
- Priority (Priorité)
- Multilevel Queue (File d'attente à multiples niveaux)

**Groupe 2 : Allocation mémoire**
- First-Fit (Premier ajustement)
- Best-Fit (Meilleur ajustement)
- Worst-Fit (Pire ajustement)

**Groupe 3 : Remplacement de pages**
- FIFO (First-In-First-Out)
- LRU (Least Recently Used)
- NRU (Not Recently Used)
- Optimal (Algorithme optimal de Belady)
- Seconde chance (Second Chance)

---

### Question 7 : Allocation mémoire avec segments

**Données du problème**

| Segment | Base | Longueur |
|---------|------|----------|
| 0 | 219 | 600 |
| 1 | 2300 | 14 |
| 2 | 90 | 100 |
| 3 | 1327 | 580 |
| 4 | 1952 | 96 |

**Demandes** : 430, 10, 500, 400, 112

#### 7a) Trois termes applicables [0,25 pt]

**Réponse** : **First-Fit**, **Best-Fit**, **Worst-Fit**

#### 7b) Algorithme utilisant efficacement la mémoire [3,5 pts]

**Réponse : BEST-FIT**

**Application détaillée des trois algorithmes**

**1. FIRST-FIT** (Premier bloc suffisant)

| Demande | Segment choisi | Taille | État |
|---------|----------------|--------|------|
| 430 | Seg 0 | 600 | ✅ Reste 170 |
| 10 | Seg 1 | 14 | ✅ Reste 4 |
| 500 | Seg 3 | 580 | ✅ Reste 80 |
| 400 | Seg 0 (reste 170) | 170 | ❌ **ÉCHEC** (170 < 400) |
| 112 | - | - | Non traité |

**Résultat First-Fit : 3 allocations réussies / 5**

---

**2. BEST-FIT** (Plus petit bloc suffisant)

| Demande | Segments disponibles | Choix Best-Fit | État |
|---------|---------------------|----------------|------|
| 430 | 0(600), 2(100), 3(580), 4(96) | Seg 3 (580) | ✅ Reste 150 |
| 10 | 0(600), 1(14), 2(100), 3(150), 4(96) | Seg 1 (14) | ✅ Reste 4 |
| 500 | 0(600), 2(100), 3(150), 4(96) | Seg 0 (600) | ✅ Reste 100 |
| 400 | 2(100), 3(150), 4(96), 0(100) | Max=150 | ❌ **ÉCHEC** |
| 112 | 2(100), 3(150), 4(96), 0(100) | Seg 3 (150) | ✅ Reste 38 |

**Résultat Best-Fit : 4 allocations réussies / 5**

---

**3. WORST-FIT** (Plus grand bloc)

| Demande | Segments disponibles | Choix Worst-Fit | État |
|---------|---------------------|-----------------|------|
| 430 | 0(600), 2(100), 3(580), 4(96) | Seg 0 (600) | ✅ Reste 170 |
| 10 | 0(170), 1(14), 2(100), 3(580), 4(96) | Seg 3 (580) | ✅ Reste 570 |
| 500 | 0(170), 1(4), 2(100), 3(570), 4(96) | Seg 3 (570) | ✅ Reste 70 |
| 400 | 0(170), 2(100), 3(70), 4(96) | Max=170 | ❌ **ÉCHEC** |
| 112 | - | - | Non traité |

**Résultat Worst-Fit : 3 allocations réussies / 5**

---

**Tableau comparatif**

| Algorithme | Allocations réussies | Fragmentation |
|------------|---------------------|---------------|
| First-Fit | 3/5 (60%) | Moyenne |
| **Best-Fit** | **4/5 (80%)** | **Minimale** |
| Worst-Fit | 3/5 (60%) | Maximale |

**Justification**

**Best-Fit est le plus efficace** car :
1. ✅ Réussit 4 allocations sur 5 (meilleur taux)
2. ✅ Minimise la fragmentation externe
3. ✅ Préserve les grands blocs pour les grandes demandes futures
4. ✅ Utilise les petits blocs qui seraient autrement inutilisables

**Principe** : Choisir le plus petit trou suffisant évite de fragmenter inutilement les grands blocs.

---

### Question 8 : Remplacement de pages

**Données**
- **Références** : 1, 2, 3, 4, 2, 1, 5, 6, 2, 1, 2, 3, 7, 6, 3, 2, 1, 2, 3, 6
- **Cadres mémoire** : 5 cases

#### 8a) Deux termes applicables [0,25 pt]

**Réponse** : **FIFO** et **LRU**

*(Optimal est théorique et NRU/Seconde chance nécessitent des bits de référence non fournis)*

#### 8b) Algorithme utilisant efficacement la mémoire [4 pts]

**Réponse : LRU (Least Recently Used)**

---

**Application FIFO** (First-In-First-Out)

```
Référence:   1   2   3   4   2   1   5   6   2   1   2   3   7   6   3   2   1   2   3   6
          ┌───────────────────────────────────────────────────────────────────────────────────┐
Case 1    │ 1   1   1   1   1   1   5   5   5   5   5   3   3   3   3   3   1   1   1   1 │
Case 2    │ -   2   2   2   2   2   2   6   6   6   6   6   7   7   7   7   7   2   2   2 │
Case 3    │ -   -   3   3   3   3   3   3   2   2   2   2   2   6   6   6   6   6   3   3 │
Case 4    │ -   -   -   4   4   4   4   4   4   1   1   1   1   1   6   6   6   6   6   6 │
Case 5    │ -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   2   2   2   2   2 │
          └───────────────────────────────────────────────────────────────────────────────────┘
Défaut    │ F   F   F   F   -   -   F   F   F   F   -   F   F   F   -   F   F   -   -   - │
```

**Défauts de page FIFO : 14**

---

**Application LRU** (Least Recently Used)

```
Référence:   1   2   3   4   2   1   5   6   2   1   2   3   7   6   3   2   1   2   3   6
          ┌───────────────────────────────────────────────────────────────────────────────────┐
Case 1    │ 1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1 │
Case 2    │ -   2   2   2   2   2   2   2   2   2   2   2   2   2   2   2   2   2   2   2 │
Case 3    │ -   -   3   3   3   3   3   3   3   3   3   3   3   3   3   3   3   3   3   3 │
Case 4    │ -   -   -   4   4   4   5   5   5   5   5   5   7   7   7   7   7   7   7   6 │
Case 5    │ -   -   -   -   -   -   -   6   6   6   6   6   6   6   6   6   6   6   6   6 │
          └───────────────────────────────────────────────────────────────────────────────────┘
Défaut    │ F   F   F   F   -   -   F   F   -   -   -   -   F   -   -   -   -   -   -   - │
```

**Défauts de page LRU : 8**

---

**Tableau détaillé LRU**

| Réf | Cadres après insertion | Hit/Fault | Explication |
|-----|------------------------|-----------|-------------|
| 1 | [1] | F | Première insertion |
| 2 | [1,2] | F | Ajout |
| 3 | [1,2,3] | F | Ajout |
| 4 | [1,2,3,4] | F | Ajout |
| 2 | [1,2,3,4] | ✓ | 2 déjà présent (hit) |
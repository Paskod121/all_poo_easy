
#1) Position d'un OS dans un système informatique [1 pt]
┌─────────────────────────────┐
│     UTILISATEUR            │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│     APPLICATIONS           │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│  SYSTÈME D'EXPLOITATION    │
│         (OS)               │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│    MATÉRIEL (Hardware)     │
│  CPU, Mémoire, Disques...  │
└─────────────────────────────┘
```

L'OS est la couche intermédiaire entre le matériel et les applications.

## 2) Différence LOGICIEL vs APPLICATION [1 pt]

- **LOGICIEL** : Terme général désignant tout programme informatique (OS, pilotes, applications)
- **APPLICATION** : Logiciel spécifique destiné à l'utilisateur final pour accomplir des tâches précises (Word, navigateur web, etc.)

Une application est un type de logiciel, mais tout logiciel n'est pas une application.

## 3) PLUG AND PLAY [2 pts]

**Définition** : Technologie permettant la détection et configuration automatique des périphériques matériels sans intervention manuelle de l'utilisateur.

**Sur les handheld computers** : Oui, le Plug and Play existe sur les ordinateurs portables et smartphones (détection automatique des écouteurs, cartes SD, périphériques USB, etc.).

## 4) CŒUR vs PROCESSEUR [2 pts]

**Évolution** : 
- Auparavant : 1 processeur = 1 unité de calcul
- Aujourd'hui : 1 processeur = plusieurs cœurs (dual-core, quad-core, octa-core)

Chaque cœur est une unité de traitement indépendante. Cette évolution permet :
- Parallélisme réel des tâches
- Meilleure performance sans augmenter la fréquence (limite physique de chaleur)
- Efficacité énergétique supérieure

## 5) Multitâches et multiutilisateurs [2 pts]

**Multitâches** : Capacité d'exécuter plusieurs processus simultanément (pour un ou plusieurs utilisateurs)

**Multiutilisateurs** : Capacité de gérer plusieurs utilisateurs connectés simultanément

**Rapport** : Le multiutilisateur implique nécessairement le multitâche (chaque utilisateur lance ses propres tâches), mais le multitâche peut exister sans multiutilisateur (un seul utilisateur avec plusieurs programmes ouverts).

## 6) SPOOLING [2 pts]

**SPOOLING** (Simultaneous Peripheral Operations On-Line) : Technique de gestion des E/S où les données destinées à un périphérique lent (imprimante) sont d'abord stockées sur disque dans une file d'attente avant traitement séquentiel.

**Dispositif précipitant** : L'**imprimante** - Sa lenteur créait des goulots d'étranglement. Le spooling permet au CPU de continuer son travail sans attendre la fin de l'impression.

## 7) L'ontogenèse résume la phylogenèse [2 pts]

En informatique : Le développement individuel d'un programmeur ou système (ontogenèse) reproduit l'évolution historique de l'informatique (phylogenèse).

**Exemples** :
- Un étudiant apprend d'abord la programmation procédurale, puis l'orienté objet (comme l'histoire de la programmation)
- Les systèmes embarqués actuels reproduisent l'évolution : batch → temps partagé → temps réel

## 8) INTERFACE UTILISATEUR [2 pts]

**Définition** : Moyen par lequel l'utilisateur interagit avec le système (entrées/sorties).

**Évolution actuelle** :
- CLI (Command Line Interface) → GUI (Graphical User Interface)
- Interfaces tactiles multi-touch
- Interfaces vocales (assistants : Siri, Alexa)
- Interfaces gestuelles et réalité augmentée/virtuelle
- Interfaces adaptatifs avec IA

## 9) Erreur de parité [1 pt]

Technique de détection d'erreurs en mémoire : un bit supplémentaire (bit de parité) est ajouté pour vérifier l'intégrité des données. Si la parité calculée ne correspond pas à celle stockée, une erreur de parité est signalée, indiquant une corruption potentielle des données.

## 10) Protection et Sécurité [2 pts]

**Protection** : Mécanismes internes contrôlant l'accès aux ressources du système (mémoire, fichiers, CPU)

**Sécurité** : Défense contre les menaces externes et internes (malware, accès non autorisés)

**Mise en œuvre dans les OS** :
- Mode utilisateur vs mode noyau
- Permissions et droits d'accès (lecture/écriture/exécution)
- Authentification (mots de passe, biométrie)
- Pare-feu et antivirus intégrés

## 11) Appels système [1 pt]

Interface entre les programmes utilisateurs et le noyau de l'OS. Permettent aux applications de demander des services système (création de processus, accès fichiers, allocation mémoire, E/S) en passant du mode utilisateur au mode noyau.

## 12) Concept de processus et cycle de vie [2 pts]

**Processus** : Programme en cours d'exécution, comprenant le code, les données, la pile, le compteur ordinal et les registres.

**Cycle de vie** :
```
         ┌─────────┐
         │ NOUVEAU │
         └────┬────┘
              │
              ▼
         ┌────────┐    Élu      ┌───────────┐
    ┌───│  PRÊT  │◄─────────────│ EXÉCUTION │
    │   └────────┘              └─────┬─────┘
    │        ▲                        │
    │        │                        │
Créa-       │                    Interruption
tion        │                         │
    │        │                        ▼
    │   ┌────┴────┐              Terminaison
    │   │  BLOQUÉ │                   │
    │   └─────────┘                   │
    │   (Attente E/S)                 ▼
    │                            ┌─────────┐
    └───────────────────────────►│ TERMINÉ │
                                 └─────────┘
```

---

# CORRIGÉ EXAMEN DE SYNTHÈSE

## 1) Citation de Silberstchatz [2,5 pts]

**Termes en relief** :
- **Système d'exploitation** : Logiciel de base gérant les ressources matérielles et fournissant des services aux applications
- **Système informatique** : Ensemble matériel + logiciels permettant le traitement de l'information

**Explication** : L'OS est indispensable car il :
- Gère et partage les ressources (CPU, mémoire, E/S)
- Fournit une abstraction du matériel aux applications
- Assure protection et sécurité
- Sans OS, chaque application devrait gérer directement le matériel (complexe et dangereux)

## 2a) Évolution historique des systèmes informatiques [2,5 pts]

1. **Précurseurs** (1940s) : Machines électromécaniques (ENIAC), programmation par câblage
2. **Mainframes** (1950s-60s) : Ordinateurs centraux, systèmes batch
3. **Miniordinateurs** (1970s) : Plus petits, moins chers (DEC PDP)
4. **Micro-ordinateurs/PC** (1980s) : Ordinateurs personnels (Apple II, IBM PC)
5. **Ordinateurs portables** (1990s) : Mobilité accrue
6. **Smartphones/tablettes** (2000s-aujourd'hui) : Convergence téléphonie-informatique, tactile, connectivité permanente

## 2b) Évolution historique des types d'OS [3 pts]

1. **Batch systems** (systèmes par lots) : Traitement de jobs sans interaction
   - *Dans Android* : Tâches planifiées en arrière-plan
   
2. **Multiprogramming** : Plusieurs programmes en mémoire
   
3. **Time-sharing** (temps partagé) : Plusieurs utilisateurs interactifs simultanés
   
4. **Real-time systems** : Réponses dans des délais stricts
   - *Dans Android* : Gestion appels téléphoniques, lecture multimédia
   
5. **Distributed systems** : Ressources réparties sur réseau
   
6. **Mobile OS** : Optimisés pour batterie, tactile, connectivité

## 3) Point commun des termes [0,5 pt]

Ce sont tous des **algorithmes** ou **stratégies** utilisés dans la gestion des ressources système.

## 4) Nombre de groupes [0,5 pt]

**3 groupes**

## 5) Nom des groupes [1,5 pts]

1. **Algorithmes d'ordonnancement CPU** (CPU Scheduling)
2. **Algorithmes d'allocation mémoire** (Memory Allocation)
3. **Algorithmes de remplacement de pages** (Page Replacement)

## 6) Répartition des termes [1,5 pts]

**Groupe 1 - Ordonnancement CPU** :
- FCFS (First-Come, First-Served)
- SJF (Shortest-Job-First)
- RR (Round Robin)
- Priority (Priorité)
- Multilevel Queue

**Groupe 2 - Allocation mémoire** :
- First-Fit
- Best-Fit
- Worst-Fit

**Groupe 3 - Remplacement de pages** :
- FIFO (First-In-First-Out)
- LRU (Least Recently Used)
- NRU (Not Recently Used)
- Optimal
- Seconde chance

## 7a) Trois termes applicables [0,25 pt]

**First-Fit, Best-Fit, Worst-Fit** (algorithmes d'allocation mémoire)

## 7b) Terme utilisant efficacement la mémoire [3,5 pts]

**Best-Fit** utilise la mémoire le plus efficacement.

**Justification** :

| Demande | First-Fit | Best-Fit | Worst-Fit |
|---------|-----------|----------|-----------|
| 430 | Seg 0 (600) | Seg 3 (580) | Seg 0 (600) |
| 10 | Seg 1 (14) | Seg 1 (14) | Seg 0 reste (170) |
| 500 | Seg 2 (100) ❌ ÉCHEC | Seg 0 (600) | Seg 3 (580) ❌ ÉCHEC |
| 400 | Impossible | Seg 3 reste (150) ❌ | Impossible |

**Application Best-Fit** (détaillée) :
- 430 → Segment 3 (580) : reste 150
- 10 → Segment 1 (14) : reste 4
- 500 → Segment 0 (600) : reste 100
- 400 → ÉCHEC (plus grand bloc disponible = 150)
- 112 → Segment 3 reste (150) : reste 38

**Best-Fit** réussit 4 allocations sur 5, minimisant la fragmentation en choisissant le plus petit bloc suffisant.

## 8a) Deux termes applicables manuellement [0,25 pt]

**FIFO et LRU** (algorithmes de remplacement de pages)

## 8b) Terme utilisant efficacement la mémoire [4 pts]

**LRU** utilise la mémoire plus efficacement.

**Application avec 5 cases** :

**FIFO** :
```
Référence:  1  2  3  4  2  1  5  6  2  1  2  3  7  6  3  2  1  2  3  6
Cases:      1  1  1  1  1  1  5  5  5  5  5  3  3  3  3  3  1  1  1  1
            -  2  2  2  2  2  2  6  6  6  6  6  7  7  7  7  7  2  2  2
            -  -  3  3  3  3  3  3  2  2  2  2  2  6  6  6  6  6  3  3
            -  -  -  4  4  4  4  4  4  1  1  1  1  1  6  6  6  6  6  6
            -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  2  2  2  2  2
```
**Défauts de page FIFO : 12**

**LRU** :
```
Référence:  1  2  3  4  2  1  5  6  2  1  2  3  7  6  3  2  1  2  3  6
Cases:      1  1  1  1  1  1  1  1  1  1  1  1  7  7  7  7  7  7  7  7
            -  2  2  2  2  2  2  2  2  2  2  2  2  2  2  2  2  2  2  2
            -  -  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3
            -  -  -  4  4  4  5  5  5  5  5  5  5  6  6  6  6  6  6  6
            -  -  -  -  -  -  -  6  6  1  1  1  1  1  1  1  1  1  1  1
package fr.diginamic.salaire;

public abstract class Intervenant {
    private String prenom;
    private String nom;

    public Intervenant(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    public abstract void getSalaire();
}


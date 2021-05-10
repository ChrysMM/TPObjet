package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    int nombreJourTravaille;
    int montantJourRemu;

    public Pigiste(String prenom, String nom, int nombreJourTravaille, int montantJourRemu) {
        super(prenom, nom);
        this.nombreJourTravaille = nombreJourTravaille;
        this.montantJourRemu = montantJourRemu;
    }

    @Override
    public void getSalaire() {

    }
}








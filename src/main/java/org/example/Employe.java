package compagnieAerienne;

public class Employe extends Personne {

    private int numeroEmploye;
    private String dateEmbauche; // pour l’instant en String, simple

    public Employe(int identifiant, String nom, String adresse, String contact,
                   int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé";
    }
}

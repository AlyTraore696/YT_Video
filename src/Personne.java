import java.time.LocalDate;

public class Personne { String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    LocalDate ld = LocalDate.now();
    public String affiche(){
        return "mon nom c'est "+nom+" "+ld;
    }
}

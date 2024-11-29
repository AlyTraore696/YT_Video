public class Developpeur extends Personne{
    String langage;
    public Developpeur(String nom, String langage) {
        super(nom);
        this.langage = langage;
    }
    public String affiche(){
        return nom+" Langage est "+langage;
    }

}

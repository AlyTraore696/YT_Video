public class Main {
    public static void main(String[] args) {
        Personne[] tab= new Personne[3];
        populataTab(tab);
        for(Personne p : tab) {
            affiche(p);
        }
    }

    private static void affiche(Personne moi) {
        System.out.println(moi.affiche());
    }

    private static void populataTab(Personne[] tab) {
        for (int i=0; i<tab.length; i++){
            if (i==0) tab[i]=new Personne("Aly ");
            else tab[i]=new Developpeur("Dev "+i,"Java");
        }
    }
}
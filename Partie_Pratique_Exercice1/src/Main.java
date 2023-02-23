public class Main {
    public static void main(String[] args) {
        Produit p = new Produit(43,23.2);
        Boutique b = new Boutique();
        System.out.println(b.supprimer(p));
    }
}
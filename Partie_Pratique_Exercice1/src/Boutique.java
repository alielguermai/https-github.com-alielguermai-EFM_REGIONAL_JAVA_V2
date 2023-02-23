import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Boutique {
    ArrayList<Produit> liste = new ArrayList<>();
    public int indiceDe(int code){
        int indice=0;
        for (Produit p : liste){
            if (p.code==code)
                return indice;
            indice++;
        }
        return -1;
    }
    public void ajouter(Produit p) throws IOException {
        if (liste.contains(p))
            throw new IOException("Le produit appartient deja a la boutique");
        liste.add(p);
    }
    public boolean supprimer(int code){
        for (Produit p : liste){
            if (p.code==code){
                liste.remove(p);
                return true;
            }
        }
        return false;
    }
    public boolean supprimer(Produit p){
        if (liste.contains(p)){
            liste.remove(p);
            return true;
        }
        return false;
    }
    public int nombreProduitsEnSolde(){
        return liste.size();
    }
    public void enregister(String chemin) throws IOException {
        FileWriter fichier = new FileWriter(chemin);
        fichier.write(liste.toString());
        fichier.close();
    }
}

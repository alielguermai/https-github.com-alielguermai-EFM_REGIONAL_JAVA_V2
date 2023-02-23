import java.util.Objects;

public class Produit {
    int code;
    double prix_origine;

    public Produit(int code, double prix_origine) {
        this.code = code;
        this.prix_origine = prix_origine;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "code=" + code +
                "; prix_origine=" + prix_origine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return code == produit.code;
    }
    public double prixProduit(){
        return prix_origine;
    }
}

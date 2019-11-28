
package assignement2;

/**
 *
 * @author sanel helja
 */
public abstract class Product {
    //
    public static final double POREZ = 0.2;
    
    private String nazivProizvoda;
    private String barKod;
    private double cijena;

    public Product(String nazivProizvoda, String barKod, double cijena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.cijena = cijena;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public String getBarKod() {
        return barKod;
    }

    public double getCijena() {
        return cijena;
    }
    
    public abstract double konacnaCijena();
}

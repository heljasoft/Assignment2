
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
    
    public Product(String nazivProizvoda, String barKod) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public String getBarKod() {
        return barKod;
    }

    public abstract double izracunCijene();
    
    @Override
    public String toString() {
        return "Ime proizvoda: "+ nazivProizvoda + "\nBar Code: "+ barKod;
    }
    
    
}


package assignement2;

/**
 *
 * @author sanel helja
 */
public abstract class Product {
    //porez od 20% 
    public final double POREZ = 1.2;
    
    private String nazivProizvoda;
    private String barKod;
    private double osnovnaCijena;
    
    public Product(String nazivProizvoda, String barKod, double osnovnaCijena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCijena = osnovnaCijena;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public String getBarKod() {
        return barKod;
    }

    public double getOsnovnaCijena() {
        return osnovnaCijena;
    }
    
    public double ukupnaCijena(){
        double rezultat = osnovnaCijena * POREZ;
        return rezultat;
    }
    
    @Override
    public String toString() {
        return "Ime proizvoda: "+ nazivProizvoda + "\nBar Code: "+ barKod;
    }
    
    
}

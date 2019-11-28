
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Chocolate extends Product{
    
    private double tezina;

    public Chocolate(String nazivProizvoda, String barKod, double cijena, double tezina) {
        super(nazivProizvoda, barKod, cijena);
        this.tezina = tezina;
    }

    @Override
    public double konacnaCijena() {
        return;
    }
    
}

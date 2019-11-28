
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Wine extends Product{
    
    static final double DODATNI_POREZ = 0.1;
    private double zapreminaBoce;

    public Wine(String nazivProizvoda, String barKod, double cijena, double zapreminaBoce) {
        super(nazivProizvoda, barKod, cijena);
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    public double konacnaCijena() {
        return 0.0;
    }
    
    
    
}

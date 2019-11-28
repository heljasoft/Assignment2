
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Chocolate extends Product{
    
    private double cijena;
    private double tezina;

    public Chocolate(String nazivProizvoda, String barKod, double cijena, double tezina) {
        super(nazivProizvoda, barKod);
        this.cijena = cijena + (cijena * POREZ);
        this.tezina = tezina;
        
    }

    public double getCijena() {
        return cijena;
    }

    public double getTezina() {
        return tezina;
    }

    @Override
    public String toString() {
        String rezultat = super.toString();
        return rezultat + "\nKonacna cijena: "+ cijena + "\nTežina: "+ tezina;
    }
    
    
}

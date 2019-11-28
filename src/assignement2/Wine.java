
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Wine extends Product{
    
    private double cijena;
    private double zapreminaBoce;
    private final double DODATNI_POREZ = 0.1;
    

    public Wine(String nazivProizvoda, String barKod, double cijena, double zapreminaBoce) {
        super(nazivProizvoda, barKod);
        this.cijena = cijena;
        this.zapreminaBoce = zapreminaBoce;
    }

    public double getCijena() {
        return cijena;
    }

    public double getZapreminaBoce() {
        return zapreminaBoce;
    }

    @Override
    public double izracunCijene() {
        double izracun = cijena + (cijena * POREZ) + (cijena * DODATNI_POREZ);
        return izracun;
    }

    @Override
    public String toString() {
        String rezultat = super.toString();
        return rezultat + "\nKonacna cijena: "+ izracunCijene() + "\nZapremina boce: "+ zapreminaBoce;
    }
    
    
}

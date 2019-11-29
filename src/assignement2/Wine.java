
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Wine extends Product{
    
    private double zapreminaBoce;
    //dodatni porez samo za vino od 10%
    private final double DODATNI_POREZ = 1.1;

    public Wine(double zapreminaBoce, String nazivProizvoda, String barKod, double osnovnaCijena) {
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.zapreminaBoce = zapreminaBoce;
    }
    

    public double getZapreminaBoce() {
        return zapreminaBoce;
    }

    @Override
    public double ukupnaCijena() {
        return (super.ukupnaCijena()*DODATNI_POREZ); 
    }

    
    @Override
    public String toString() {
        String rezultat = super.toString();
        return rezultat + "\nKonacna cijena: "+ ukupnaCijena() + "\nZapremina boce: "+ zapreminaBoce;
    }
    
    
}

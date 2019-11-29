
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Chocolate extends Product{
    
    private double tezina;

    public Chocolate(double tezina, String nazivProizvoda, String barKod, double osnovnaCijena) {
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.tezina = tezina;
    }

    public double getTezina() {
        return tezina;
    }

    @Override
    public double ukupnaCijena() {
        return super.ukupnaCijena(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String rezultat = super.toString();
        return rezultat + "\nKonacna cijena: "+ ukupnaCijena() + "\nTežina: "+ tezina;
    }
    
    
}

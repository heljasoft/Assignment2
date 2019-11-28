
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Test {
    public static void main(String[] args) {
        
        Product chocolate = new Chocolate("Milka", "00387689125", 2.50, 100);
        System.out.println(chocolate.toString());
        Product wine = new Wine("Blatina", "00387346981", 13.50, 0.75);
        System.out.println(wine.toString());
    }
}

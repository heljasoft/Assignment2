
package assignement2;

/**
 *
 * @author sanel helja
 */
public class Test {
    public static void main(String[] args) {
        
        Product cokolada = new Chocolate(100, "Milka", "0038758964", 1.70);
        System.out.println(cokolada.toString());
        Product vino = new Wine(0.75, "Blatina", "0038795837", 12.30);
        System.out.println(vino.toString());
    }
}

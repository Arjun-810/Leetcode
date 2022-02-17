import java.util.LinkedHashSet;
import java.util.Set;

public class linkedSet {
    public static void main(String[] args) {
        Set<Integer> ls = new LinkedHashSet<>();
        System.out.println("To add");
        ls.add(10);
        ls.add(20);
        ls.add(30);
        System.out.println("Print hash set = " + ls);
        System.out.println("To remove");
        ls.remove(10);
        System.out.println("Print = "+ ls);
        System.out.println("To check contauins");
        System.out.println("Contains 20 = "+ls.contains(20));
    }
}

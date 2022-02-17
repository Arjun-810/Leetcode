import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        System.out.println("To add");
        ts.add(10);
        ts.add(5);
        ts.add(2);
        System.out.println("Print all elements = " + ts);
    }
}

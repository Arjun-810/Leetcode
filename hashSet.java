import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Add elements");
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);//repeated elements cant be added
        System.out.println("set = " +set);
        System.out.println("Remove elements");
        set.remove(10);
        System.out.println("Set = " + set);
        System.out.println("Check contains");
        System.out.println("Check 10 is available or not = " + set.contains(10));
        System.out.println("Check is empty");
        System.out.println(set.isEmpty());
        System.out.println("Size = " + set.size());
        System.out.println("TO clear");
        set.clear();
        System.out.println(set);
    }
}

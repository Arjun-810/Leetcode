import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("New list");
        List<Integer> new_list = new ArrayList<>();
        new_list.add(40);
        new_list.add(50);
        list.add(2,80);
        list.addAll(new_list);
        System.out.println("Get function = " + list.get(2));
        for (int a: list)
            System.out.println(a);
        System.out.println("Array list = " + list);
        System.out.println("Is contains 100 = " + list.contains(100));
        System.out.print("Enter any value = ");
        int s = sc.nextInt();
        list.add(s);
        System.out.println("Updated list = " + list);
    }
}

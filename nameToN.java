import java.util.Scanner;

public class nameToN {
    public static void nameNTimes(String name, int i,int n) {
        System.out.println(name);
        if (i==n)
            return;
        nameNTimes(name, i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name = ");
        String name = sc.next();
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        nameNTimes(name,1,n);
    }
}

import java.util.Scanner;

public class meatBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for (int i=0;i<n;i++)
            arr[i] = arr[i]+1/2;
        int f = 0,idx = 0;
        for (int i=0;i<n;i++){
            if(f<arr[i]){
                f = arr[i];
                idx = i+1;
            }
        }
        System.out.println("person = " + idx);
    }
}

import java.util.Scanner;

public class selectionSort {
    public static int[] selection(int[] arr) {
        for (int i=0;i< arr.length-1;i++){
            int smallest = i;
            for (int j=i;j< arr.length-1;j++){
                if (arr[smallest]>arr[j+1]){
                    smallest = j+1;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        System.out.print("Enter the elements :");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] sorted = selection(arr);
        for (int a: sorted)
            System.out.print(a+ " ");
    }
}

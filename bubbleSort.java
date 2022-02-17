import java.util.Scanner;

public class bubbleSort {
    public static int[] bubbleSortArray(int[] arr) {
        int n = arr.length;
        int i = n;
        while (i>n-1 && i>2){
            for (int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            n--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of string = ");
        int n = sc.nextInt();
        System.out.print("Enter members of array = ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] sorted_arr = bubbleSortArray(arr);
        for (int a:sorted_arr)
            System.out.println(a+ " ");
    }
}

import java.util.Scanner;

public class infitiq3 {
    public static boolean isPrime(int n)
    {
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        int n = str.length();
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i<n;i++){
            char c = '0';
            if(Character.isDigit(str.charAt(i))){
                flag = true;
                while(i < n && Character.isDigit(str.charAt(i))){
                    c = str.charAt(i);
                    i++;
                }
            }
            sum += c - '0';
        }
        if (sum == 0)
            System.out.println(-1);
        else if(sum == 1 || sum == 2)
            System.out.println(sum);
        else {
            if(isPrime(sum))
                System.out.println(sum);
            else{
                int rev = 0;
                while(sum != 0) {
                    int remainder = sum % 10;
                    rev = rev * 10 + remainder;
                    sum = sum/10;
                }
                if (isPrime(rev))
                    System.out.println(rev);
                else{
                    int c= 0;
                    for (int k=1;k<=rev;k++){
                        if(rev%k == 0)
                            c++;
                    }
                    System.out.println(c);
                }

            }

        }

    }
}

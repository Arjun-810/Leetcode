import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class commaSeprated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0,sum,f= 0;
        String num2 = "";
        String n = sc.nextLine();
        String[] array = n.split(",");
        for (String a:array){
            if(parseInt(a) == 5)
                f = 1;
            if (f == 1)
                num2 += a;
            else
                num1 += parseInt(a);
            if(parseInt(a) == 8)
                f =0;
        }
        sum = num1+parseInt(num2);
        System.out.println(sum);
    }
}

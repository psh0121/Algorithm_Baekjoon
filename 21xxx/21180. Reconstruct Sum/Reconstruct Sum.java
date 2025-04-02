import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        while (n-- > 0) {
            int num = sc.nextInt();
            set.add(num);
            sum += num;
        }

        String result = "BAD";

        for(int value : set) {
            if(value == sum - value) {
                result  = "" + value;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
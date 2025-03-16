import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        System.out.println(new String(arr));
        sc.close();
    }
}
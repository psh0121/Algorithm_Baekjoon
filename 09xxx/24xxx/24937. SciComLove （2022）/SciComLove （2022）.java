import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("SciComLove".split("")));

        for(int i = 0; i < n % 10; i++) {
          list.add(list.remove(0));
        }

        String result = "";

        for(String letter : list) {
          result += letter;
        }

        System.out.println(result);
        sc.close();
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alphabetArr = "abcdefghijklmnopqrstuvwxyz".split("");

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList(alphabetArr));

            int m = sc.nextInt();
            StringBuilder result = new StringBuilder();
            for(int j = 0; j < m; j++) {
                String alphabet = list.remove(sc.nextInt());
                result.append(alphabet);
                list.add(0, alphabet);
            }

            System.out.println(result.toString().trim());
        }
        sc.close();
    }
}
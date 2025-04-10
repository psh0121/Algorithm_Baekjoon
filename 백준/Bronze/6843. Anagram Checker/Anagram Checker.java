import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll(" ", "");
        String s2 = sc.nextLine().replaceAll(" ", "");

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        String result = "Is an anagram.";

        if(c1.length != c2.length) {
            System.out.println("Is not an anagram.");
            return;
        }

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                result = "Is not an anagram.";
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String num = sc.next();
        Set<String> seenNumbers = new HashSet<>();

        while (!seenNumbers.contains(num)) {
            seenNumbers.add(num);
            cnt++;

            int middle = Integer.parseInt(num.substring(1, 3));
            int middlePow2 = middle * middle;
            String square = String.format("%04d", middlePow2);

            num = square;
        }
        
        System.out.println(cnt);
        sc.close();
    }
}

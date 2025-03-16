import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String str = sc.next();
            int num = sc.nextInt();

            Deque<String> queue = new ArrayDeque<>(Arrays.asList(str.split("")));

            for(int i = 1; i <= num; i++) {
                queue.offerFirst(queue.pollLast());
            }

            StringBuilder newStr = new StringBuilder();

            while (!queue.isEmpty()) {
                newStr.append(queue.pollFirst());
            }

            System.out.println(
                "Shifting " + str + " by " + num + 
                " positions gives us: " + newStr.toString().trim()
            );
        }
        sc.close();
    }
}
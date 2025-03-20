import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if(str.equals("#")) break;
            int x = 0;
            int y = 0;

            Deque<Character> deque = new ArrayDeque<>();
            for(char value : str.toCharArray()) {
                deque.addLast(value);
            }

            int a = 0;
            int b = 0;

            while (!deque.isEmpty()) {
                char value = deque.pollFirst();

                if(value == 'A') a++;
                else b++;

                if(a >= 4 && a - b >= 2) {
                    x++;
                    a = 0;
                    b = 0;
                }
                else if(b >= 4 && b - a >= 2) {
                    y++;
                    a = 0;
                    b = 0;
                }
            }

            if(a > b) x++;
            else if(a < b) y++;

            System.out.println("A " + x + " B " + y);
        }
        sc.close();
    }
}
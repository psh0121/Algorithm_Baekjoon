import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> newDeque = new ArrayDeque<>();

        for(int i = 0; i < n; i++) deque.addLast(sc.nextInt());

        while (deque.size() != 1) {
            int num = deque.pollFirst();
            newDeque.addLast(Math.abs(num - deque.getFirst()));

            if(deque.size() == 1) {
                deque = new ArrayDeque<>();
                
                for(Integer value : newDeque) {
                    deque.addLast(value);
                }

                newDeque = new ArrayDeque<>();
            }
        }

        System.out.println(deque.getFirst());
        sc.close();
    }
}
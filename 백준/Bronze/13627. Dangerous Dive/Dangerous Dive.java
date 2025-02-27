import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            array.add(i);
        }

        if(n == r) {
            System.out.println("*");
            return;
        }

        ArrayList<Integer> removeArray = new ArrayList<>();
        for(int i = 0; i < r; i++) {
            removeArray.add(sc.nextInt());
        }

        array.removeAll(removeArray);

        for(int val : array) System.out.print(val + " ");
        sc.close();
    }
}

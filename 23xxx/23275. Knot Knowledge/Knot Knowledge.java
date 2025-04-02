import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < n; i++) {
            set.add(sc.nextInt());
        }

        for(int i = 0; i < n-1; i++) {
            set.remove(sc.nextInt());
        }

        for(Integer value : set) {
            System.out.println(value);
        }
        sc.close();
    }
}
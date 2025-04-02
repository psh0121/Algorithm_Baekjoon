import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int low = 1;
        int high = k;

        for(int i = 0; i < n; i++) {
            int floor = sc.nextInt();
            String value = sc.next();

            if(value.equals("SAFE")) {
                low = Math.max(low, floor);
            }
            else {
                high = Math.min(high, floor);
            }
        }

        System.out.println((low+1) + " " + (high-1));
        sc.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] needPancake = {0.5, 0.5, 0.25, 0.0625, 0.5625};
        int[] needTopping = {1, 30, 25, 10};
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
          sc.nextLine();
          double[] pancake = new double[5];
          for(int j = 0; j < 5; j++) {
            pancake[j] = sc.nextDouble() / needPancake[j];
          }
          
          Arrays.sort(pancake);

          double[] topping = new double[4];
          for(int j = 0; j < 4; j++) {
            topping[j] = sc.nextDouble() / needTopping[j];
          }
          
          int toppintCnt = (int)topping[0] + (int)topping[1] + (int)topping[2] + (int)topping[3];

          System.out.println((int)Math.min(pancake[0], toppintCnt));
        } 
        sc.close();
    }
}
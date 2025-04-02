import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] dart = new int[20];
        int totalSum = 0;
        int threeSum = 20;
        int idx20 = -1;

        for(int i = 0; i < 20; i++) {
            dart[i] = Integer.parseInt(arr[i]);
            totalSum += dart[i];

            if(dart[i] == 20) idx20 = i;
        }

        if(idx20 == 0) {
            threeSum += dart[19] + dart[1];
        }
        else if(idx20 == 19) {
            threeSum += dart[18] + dart[0];
        }
        else {
            threeSum += dart[idx20-1] + dart[idx20+1];
        }

        double alice = (double)threeSum / 3;
        double bob = (double)totalSum / 20;

        if(alice == bob) System.out.println("Tie");
        else if(alice > bob) System.out.println("Alice");
        else System.out.println("Bob");

        sc.close();
    }
}

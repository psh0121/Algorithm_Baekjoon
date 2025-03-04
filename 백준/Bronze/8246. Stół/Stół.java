import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long divideAK = a / k;
        long divideBK = b / k;

        if(divideAK == 0 || divideBK == 0) {
            System.out.println(0);
            return;
        }

        long result = (divideAK * 2) + (divideBK * 2);

        if(divideAK == 1 || divideBK == 1) {
            System.out.println(divideAK * divideBK);
        }
        else System.out.println(result - 4);
        sc.close();
    }
}

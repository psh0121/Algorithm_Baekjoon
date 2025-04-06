import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static int solve(BigInteger n) {
        int[] arr = {6, 2, 4, 8};

        if(n.compareTo(BigInteger.valueOf(0)) == 0) return 1;

        BigInteger mod = n.mod(BigInteger.valueOf(4));
        int intMod = mod.intValue();

        return arr[intMod];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        System.out.println(solve(n));
        sc.close();
    }
}
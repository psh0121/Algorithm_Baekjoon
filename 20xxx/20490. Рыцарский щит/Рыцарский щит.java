import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] tri1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] tri2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(tri1);
        Arrays.sort(tri2);

        int result = tri1[0] + tri1[1] + tri2[0] + tri2[1];

        if(tri1[2] != tri2[2]) {
            result += Math.abs(tri1[2] - tri2[2]);
        }

        System.out.println(result);
        sc.close();
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String[] a = Long.toString(num).split("");

        long floorNum = Long.parseLong(a[0] + "0".repeat(a.length - 1));
        long ceilNum = Long.parseLong((Long.parseLong(a[0])+1) + "0".repeat(a.length - 1));

        long differFloor = Math.abs(num - floorNum);
        long differCeil = Math.abs(num - ceilNum);

        if(differFloor < differCeil) System.out.println(floorNum);
        else if(differFloor == differCeil) System.out.println(Math.max(floorNum, ceilNum));
        else System.out.println(ceilNum);
        
        sc.close();
    }
}
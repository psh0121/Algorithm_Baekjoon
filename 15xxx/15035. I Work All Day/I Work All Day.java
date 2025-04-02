import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        int wood = sc.nextInt();

        int value = 0;
        int calValue = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(wood % arr[i] < calValue) {
                value = arr[i];
                calValue = wood % arr[i];
            }
        }

        System.out.println(value);
        sc.close();
    }
}
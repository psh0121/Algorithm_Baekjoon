import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        boolean val1 = arr[0].equals("true") ? true : false;
        boolean val2 = arr[2].equals("true") ? true : false;

        if(arr[1].equals("AND")) System.out.println(val1 && val2);
        else System.out.println(val1 || val2);
        sc.close();
    }
}

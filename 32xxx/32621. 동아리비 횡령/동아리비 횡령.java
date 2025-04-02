import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("\\+");

        if(arr.length != 2) {
            System.out.println("No Money");
            return;
        }

        if(!arr[0].matches("[0-9]+")) {
            System.out.println("No Money");
            return;
        }

        if(arr[0].length() == 0 || arr[1].length() == 0) {
            System.out.println("No Money");
            return;
        }

        // 앞자리가 0이 포함되지 않으며
        // 두 값이 일치해야한다
        if(
            (arr[0].charAt(0) != '0') &&
            (arr[0].equals(arr[1]))
        ) System.out.println("CUTE");
        else System.out.println("No Money");
        sc.close();
    }
}
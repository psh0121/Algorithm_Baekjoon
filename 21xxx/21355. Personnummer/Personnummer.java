import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String s = sc.next();
        String result= "";
        
        if(s.contains("-")) {
            String[] arr = s.split("-");
            int year = Integer.parseInt(arr[0].substring(0, 2));

            if(year >= 20 && year <= 99) result += "19";
            else result += "20";

            result += arr[0].substring(0, 2);

            result += arr[0].substring(2);
            result += arr[1];
        }
        else {
            String[] arr = s.split("\\+");
            int year = Integer.parseInt(arr[0].substring(0, 2));

            if(year >= 40 && year <= 99) result += "18";
            else result += "19";

            result += arr[0].substring(0, 2);

            result += arr[0].substring(2);
            result += arr[1];
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

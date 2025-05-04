import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        sc.nextLine();
        String s = sc.nextLine();

        String[] arr = {"0 1 2", "0 2 1", "1 0 2",
                        "1 2 0", "2 0 1", "2 1 0"};
        
        String result = "NIE";

        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) {
                result = "TAK";
                break;
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

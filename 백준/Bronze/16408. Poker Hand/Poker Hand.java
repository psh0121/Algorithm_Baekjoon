import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            char value = arr[i].charAt(0);
            if(!map.containsKey(value)) {
                map.put(value, 1);
            }
            else {
                map.put(value, map.get(value) + 1);
            }
        }

        int maxCnt = 0;

        for(Character key : map.keySet()) {
            maxCnt = Math.max(maxCnt, map.get(key));
        }

        System.out.println(maxCnt);
        sc.close();
    }
}

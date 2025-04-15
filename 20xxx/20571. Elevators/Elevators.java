import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String s = sc.next() + " " + sc.next();
        Map<String, Integer> map = new HashMap<>();

        // residential
        map.put("residential 1", 0);
        for(int i = 2; i <= 5; i++) map.put("residential " + i, 1);
        for(int i = 6; i <= 10; i++) map.put("residential " + i, 2);
        for(int i = 11; i <= 15; i++) map.put("residential " + i, 3);
        for(int i = 16; i <= 20; i++) map.put("residential " + i, 4);        

        // commercial
        map.put("commercial 1", 0);
        for(int i = 2; i <= 7; i++) map.put("commercial " + i, 1);
        for(int i = 8; i <= 14; i++) map.put("commercial " + i, 2);
        for(int i = 15; i <= 20; i++) map.put("commercial " + i, 3);

        // industrial
        map.put("industrial 1", 0);
        for(int i = 2; i <= 4; i++) map.put("industrial " + i, 1);
        for(int i = 5; i <= 8; i++) map.put("industrial " + i, 2);
        for(int i = 9; i <= 12; i++) map.put("industrial " + i, 3);
        for(int i = 13; i <= 16; i++) map.put("industrial " + i, 4);
        for(int i = 17; i <= 20; i++) map.put("industrial " + i, 5);                

        System.out.println(map.get(s));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
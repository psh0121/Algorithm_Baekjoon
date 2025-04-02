import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        TreeSet<Integer> set = new TreeSet<>();
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                set.add(key);
            }
        }

        if(set.size() == 0) {
            System.out.println("none");
            return;
        }

        int lastNum = set.last();
        int idx = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == lastNum) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);

        sc.close();
    }
}
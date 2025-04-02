import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String attack = sc.next();
        String protect = attack.replaceAll(
            "RBL|RLB|BRL|BLR|LRB|LBR"
            , "C");
        protect = protect.replaceAll("R", "S");
        protect = protect.replaceAll("B", "K");
        protect = protect.replaceAll("L", "H");

        System.out.println(protect);
        sc.close();
    }
}
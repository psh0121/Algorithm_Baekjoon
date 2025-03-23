import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        if(!str.contains("U")) result += "U";
        if(!str.contains("A")) result += "A";
        if(!str.contains("P")) result += "P";
        if(!str.contains("C")) result += "C";

        System.out.println(result);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String aeiou = "aeiou";
        String s = sc.next();
        String newS = "";

        for(int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));

            if(aeiou.contains(letter)) newS += letter;
        }

        System.out.println(newS.equals(new StringBuilder(newS).reverse().toString()) ? "S" : "N");
        sc.close();
    }
}
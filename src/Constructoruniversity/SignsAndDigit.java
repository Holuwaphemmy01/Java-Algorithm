package Constructoruniversity;
import java.util.*;

public class SignsAndDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        StringBuilder oddCharacters = new StringBuilder();
        StringBuilder evenCharacters = new StringBuilder();

        for (int count = 0; count < s.length(); count++) {
            if (count % 2 == 0) {
                oddCharacters.append(s.charAt(count));
            } else {
                evenCharacters.append(s.charAt(count));
            }
        }

        int count0 = 0, count1 = 0;
        for (char c : oddCharacters.toString().toCharArray()) {
            if (c == '0') {
                count0++;
            } else if (c == '1') {
                count1++;
            }
        }

        int countLessthan = 0, countGreaterthan = 0;
        for (char c : evenCharacters.toString().toCharArray()) {
            if (c == '<') {
                countLessthan++;
            } else if (c == '>') {
                countGreaterthan++;
            }
        }
        if (count0 == count1 && countLessthan == countGreaterthan) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

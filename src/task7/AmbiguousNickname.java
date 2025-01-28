package task7;

import java.util.Scanner;

public class AmbiguousNickname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int spiltPoint = 0;

        for (int i = 0; i <= n; i++) {
            String response = scanner.nextLine();

            for (int j = 0; j < response.length(); j++) {
                if (Character.isDigit(response.charAt(j))) spiltPoint = j;
                break;
            }
            if(Character.isDigit(response.charAt(spiltPoint)) && Character.isDigit(response.charAt(spiltPoint+1))){
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}

package task6;

import java.util.Scanner;

public class NumberOfProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;

        for (int i = 0; i <= n; i++) {
            String response = scanner.nextLine();
            if (response.startsWith("+")) count++;
        }
        System.out.println(count);
    }
}

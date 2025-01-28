package task8;

import java.util.Scanner;

public class PersonalBest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int setTime = scanner.nextInt();

        int [] array = new int[setTime];
        int bestTime = Integer.MAX_VALUE;

        for (int i = 0; i < setTime; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < setTime; i++) {
            if (array[i] < bestTime) {
                bestTime = array[i];
            }
        }
        System.out.println(bestTime);
    }
}

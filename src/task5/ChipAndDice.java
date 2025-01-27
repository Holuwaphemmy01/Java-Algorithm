package task5;

import java.util.Scanner;

public class ChipAndDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();

        System.out.println("Enter second number");
        int second = scanner.nextInt();

        if (first == second) System.out.println(4*first);
        else System.out.println(first+second);


    }

}

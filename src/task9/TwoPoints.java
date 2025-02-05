package task9;

import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstX = scanner.nextInt();
        int firstY = scanner.nextInt();
        int secondX = scanner.nextInt();
        int secondY = scanner.nextInt();

        int finalX = 0;
        int finalY = 0;

        if (firstX >= secondX)  finalX = firstX - secondX;
        else finalX = secondX - firstX;

        if (firstY >= secondY)  finalY = firstY - secondY;
        else finalY = secondY - firstY;

        System.out.println(finalX+finalY);

    }
}

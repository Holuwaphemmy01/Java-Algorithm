package task18;

import java.util.Scanner;

public class Abcd {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        String number = scanner.nextLine();

        System.out.println("Enter another number");
        String newNumber = scanner.nextLine();

        System.out.println(result(number, newNumber));
    }

    public static boolean result (String a, String b){
        for(int index = 0; index < a.length(); index++){
            if(a.charAt(index) == b.charAt(0)){
                if (a.charAt(index+1) == b.charAt(1)){
                    return true;
                }
            }
        }
        return false;
    }
}

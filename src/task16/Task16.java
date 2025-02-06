//package task16;
//
//import java.util.Scanner;
//
//public class Task16 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter how many time the test should run: ");
//        int testCases = scanner.nextInt();
//        scanner.nextLine();
//
//        while (testCases-- > 0) {
//            System.out.println("Enter the divisor");
//            int divisor = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter the number");
//            String largeNumber = scanner.nextLine();
//            System.out.println(doublePrimeNumbers(largeNumber, divisor));
//        }
//    }
//
//    private static String doublePrimeNumbers(String largeNumber, int divisor) {
//
//        String firstAlpha = "";
//        String secondAlpha = "";
//        if (divisor == 1) {
//            char[] array = largeNumber.toCharArray();
//            int first = Integer.parseInt(String.valueOf(array[0]));
//            int second = Integer.parseInt(String.valueOf(array[1]));
//
//
//
//            if (first % 2 == 0 || first % 3 == 0) {
//                while (first % 2 == 0 && first % 3 == 0) {
//                    first++;
//                }
//                firstAlpha = String.valueOf(first);
//
//            } else {
//                firstAlpha = String.valueOf(first);
//            }
//
//            if (second < 2) {
//                for(int index = 0; index <= 1; index++) {
//                    second++;
//                    if(second % 2 == 0 || second % 3 == 0) {
//                        index++;
//                    }
//                }
//                secondAlpha = String.valueOf(second);
//            } else {
//                secondAlpha = String.valueOf(second);
//            }
//            return firstAlpha + secondAlpha;
//        }
//    int large = 0;
//    if(divisor == 2) {
//        String firstPart = "";
//        String secondPart = "";
//
//        if(largeNumber.length() < 4){
//             large = Integer.parseInt(largeNumber);
//            while(large < 1010){
//                large ++;
//            }
//            largeNumber = String.valueOf(large);
////            System.out.println(largeNumber);
//        }
//
//
////        boolean ans1 = true;
////        boolean ans2 = true;
////
////        while(!ans1) {
////
////
////            for (int i = 2; i <= largeNumber.length() - 2; i++) {
////                String part1 = largeNumber.substring(0, i);
////                String part2 = largeNumber.substring(i);
////
////                if (!part1.startsWith("0") && !part2.startsWith("0")) {
////                    firstPart = part1;
////                    secondPart = part2;
////                    break;
////                }
////            }
////
////            int first = Integer.parseInt(String.valueOf(firstPart));
////            int second = Integer.parseInt(String.valueOf(secondPart));
//////            System.out.println(first);
////
////            for(int index = 2; index <= (first/2); index++) {
////                if(first % index == 0){
////                    ans1 = false;
////                    break;
////
////                }
////                else{
////                    firstAlpha = String.valueOf(first);
//////                    System.out.println(firstAlpha);
////                    ans1 = true;
////
////                }
////            }
////
////
////            for(int index = 2; index <= (second/2); index++) {
////                if(second % index == 0){
////                    ans1 = false;
////                    break;
////                }
////                else{
////                    secondAlpha = String.valueOf(second);
////                    ans2 = true;
////                }
////            }
////
////            if(ans1 == false){
////                System.out.println(largeNumber);
////                large = Integer.parseInt(largeNumber);
////                large++;
////                System.out.println(large);
////                largeNumber = String.valueOf(large);
////                System.out.println(largeNumber);
////            }
////
////
////        }
//
//        for (int i = 2; i <= largeNumber.length() - 2; i++) {
//            String part1 = largeNumber.substring(0, i);
//            String part2 = largeNumber.substring(i);
//
//            if (!part1.startsWith("0") && !part2.startsWith("0")) {
//                firstPart = part1;
//                secondPart = part2;
//                break;
//            }
//        }
//
//
//
//        int first = Integer.parseInt(String.valueOf(firstPart));
//        int second = Integer.parseInt(String.valueOf(secondPart));
//
//
//
//        for(int index = 2; index <= (first/2); index++) {
//            if(first % index == 0){
//                first++;
//            }
//            else{
//                firstAlpha = String.valueOf(first);
//                break;
//
//            }
//        }
//
//        for(int index = 2; index <= (second/2); index++) {
//            if(second % index == 0){
//                second++;
//            }
//            else{
//                secondAlpha = String.valueOf(second);
//                break;
//            }
//        }
//        return firstAlpha + secondAlpha;
//
//
//
//
//
//    }
//
//    return "aaaa";
//    }
//}


package task16;

import java.math.BigInteger;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            while (testCases-- > 0) {
                int minDigits = scanner.nextInt();
                long candidate = scanner.nextLong();
                int requiredDigits = 2 * minDigits;

                if (String.valueOf(candidate).length() < requiredDigits) {
                    candidate = (long) Math.pow(10, requiredDigits - 1);
                }

                while (true) {
                    String numStr = Long.toString(candidate);
                    if (numStr.length() >= requiredDigits && isDDoublePrime(numStr, minDigits)) {
                        System.out.println(candidate);
                        break;
                    }
                    candidate++;
                }
            }
        }
    }

    private static boolean isDDoublePrime(String num, int minDigits) {
        int length = num.length();

        for (int split = minDigits; split <= length - minDigits; split++) {
            String leftPart = num.substring(0, split);
            String rightPart = num.substring(split);

            if (!rightPart.startsWith("0") && isPrime(leftPart) && isPrime(rightPart)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPrime(String number) {
        if (number.isEmpty() || number.startsWith("0")) return false;
        BigInteger num = new BigInteger(number);
        return num.isProbablePrime(10);
    }
}


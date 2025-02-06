package task15;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        scanner.nextLine();

        while (testNumber-- > 0) {
            String name = scanner.nextLine();
            System.out.println(check(name) ? "YES": "NO");
        }

    }



    public static Boolean check(String nickName) {

        if (Character.isDigit(nickName.charAt(0))) {
            for (int i = 0; i < nickName.length(); i++) {
                if (Character.isAlphabetic(nickName.charAt(i))) {
                    return false;
                }
            }
            return false;
        }

        if (Character.isAlphabetic(nickName.charAt(0))) {
            for (int i = 0; i < nickName.length(); i++) {
                if (Character.isDigit(nickName.charAt(i))) {
                    if(Character.isDigit(nickName.charAt(i+1))) return Boolean.TRUE;
                }
            }

        }
        return true;
     }

    }



//package task15;
//
//import java.util.Scanner;
//
//public class Task15 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//
//        while (t-- > 0) {
//            String s = scanner.nextLine();
//            System.out.println(isUnambiguous(s) ? "YES" : "NO");
//        }
//
//        scanner.close();
//    }
//
//    public static boolean isUnambiguous(String s) {
//        int n = s.length();
//        int validCount = 0;
//
//
//        for (int k = 0; k <= n; k++) {
//            if (isValidSplit(s, k)) {
//                validCount++;
//            }
//        }
//
//        return validCount == 1;
//    }
//
//
//    public static boolean isValidSplit(String s, int k) {
//        int n = s.length();
//
//        if (k == 0 && n == 0) return false;
//
//
//        for (int i = 0; i < k; i++) {
//            char c = s.charAt(i);
//            if (c >= 'A' && c <= 'Z') {
//
//                continue;
//            }
//            if (c >= '0' && c <= '9') {
//                if (c == '0') {
//                    continue;
//                } else {
//                    return false;
//                }
//            }
//            return false;
//        }
//
//        for (int i = k; i < n; i++) {
//            char c = s.charAt(i);
//            if (c >= '0' && c <= '9') {
//                continue;
//            }
//
//            if (c >= 'A' && c <= 'Z') {
//                if (c == 'O') {
//                    continue;
//                } else {
//                    return false;
//                }
//            }
//            return false;
//        }
//
//        return true;
//    }
//}
//



//package Constructoruniversity;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Cinema {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int testCases = input.nextInt();
//
//
//        while (testCases-- > 0) {
//            int userAStartDays = input.nextInt();
//
//            int userAEndDays = input.nextInt();
//
//            int userBStartDays = input.nextInt();
//
//            int userBEndDays = input.nextInt();
//
//            int userCStartDays = input.nextInt();
//
//            int userCEndDays = input.nextInt();
//
//            System.out.println(calculateFreeDays(userAStartDays, userAEndDays, userBStartDays, userBEndDays, userCStartDays, userCEndDays));
//
//        }
//    }
//
//    private static int calculateFreeDays(int userAStartDays, int userAEndDays, int userBStartDays, int userBEndDays, int userCStartDays, int userCEndDays) {
//        int highestFreeDays = 0;
//        ArrayList<Integer> userA  = new ArrayList<>();
//        for(int index = userAStartDays; index <= userAEndDays; index++) {
//            userA.add(index);
//        }
//
//        ArrayList<Integer> userB  = new ArrayList<>();
//        for(int index = userBStartDays; index <= userBEndDays; index++) {
//            userB.add(index);
//        }
//
//        ArrayList<Integer> userC  = new ArrayList<>();
//        for(int index = userCStartDays; index <= userCEndDays; index++) {
//            userC.add(index);
//        }
//
//        int sizeA = userA.size();
//        int sizeB = userB.size();
//        int sizeC = userC.size();
//
//        if(sizeA > sizeB && sizeA > sizeC) {
//            highestFreeDays = sizeA;
//        }
//        else if(sizeB > sizeA && sizeB > sizeC) {
//            highestFreeDays = sizeB;
//        }
//        else if(sizeC > sizeA && sizeC > sizeB) {
//            highestFreeDays = sizeC;
//        }
//        else highestFreeDays=0;
//
//        for (Integer integer : userA) {
//            for (Integer value : userB) {
//                for (Integer item : userC) {
//                    if (integer == value && item == integer && value == item) {
//                        return integer;
//                    }
//                }
//            }
//        }
//
//        return 0;
//    }
//
//
//}


package Constructoruniversity;

//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Cinema {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int testCases = input.nextInt();
//
//        while (testCases-- > 0) {
//            int userAStartDays = input.nextInt();
//
//            int userAEndDays = input.nextInt();
//
//            int userBStartDays = input.nextInt();
//
//            int userBEndDays = input.nextInt();
//
//            int userCStartDays = input.nextInt();
//
//            int userCEndDays = input.nextInt();
//
//            System.out.println(calculateFreeDays(userAStartDays, userAEndDays, userBStartDays, userBEndDays, userCStartDays, userCEndDays));
//        }
//    }
//
//
//    private static int calculateFreeDays(int userAStartDays, int userAEndDays, int userBStartDays, int userBEndDays, int userCStartDays, int userCEndDays) {
//        Set<Integer> userA = fillDays(userAStartDays, userAEndDays);
//        Set<Integer> userB = fillDays(userBStartDays, userBEndDays);
//        Set<Integer> userC = fillDays(userCStartDays, userCEndDays);
//
//        userA.retainAll(userB);
//        userA.retainAll(userC);
//
//        return userA.isEmpty() ? 0 : userA.stream().min(Integer::compareTo).orElse(0);
//
//    }
//
//    private static Set<Integer> fillDays(int firstDay, int lastDay) {
//        Set<Integer> days = new HashSet<>();
//        for (int index = firstDay; index <= lastDay; index++) {
//            days.add(index);
//        }
//        return days;
//    }
//
//
//}
//



import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int userStartA = input.nextInt();
            int userEndA = input.nextInt();
            int userStartB = input.nextInt();
            int userEndB = input.nextInt();
            int userStartC = input.nextInt();
            int userEndC = input.nextInt();

            if (userStartA > userEndA || userStartB > userEndB || userStartC > userEndC) {
                System.out.println("0");
                continue;
            }

            int totalStart = Math.max(userStartA, Math.max(userStartB, userStartC));
            int totalEnd = Math.min(userEndA, Math.min(userEndB, userEndC));

            System.out.println(totalStart <= totalEnd ? totalStart : 0);
        }

        input.close();
    }
}


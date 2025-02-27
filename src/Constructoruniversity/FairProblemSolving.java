//package Constructoruniversity;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class FairProblemSolving {
//
//
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int testCases = input.nextInt();
//
//            while (testCases-- > 0) {
//                int numberOfProblems = input.nextInt();
//                int first = input.nextInt();
//                int second = input.nextInt();
//
//                int[] difficulties = new int[numberOfProblems];
//                for (int index = 0; index < numberOfProblems; index++) {
//                    difficulties[index] = input.nextInt();
//                }
//
//                Arrays.sort(difficulties);
//
//                int firstCount = findProblemsEachUserCanSolve(difficulties, first);
//                int secondCount = findProblemsEachUserCanSolve(difficulties, second);
//
//                int maximumNumberOfProblems = Math.min(firstCount, secondCount) / 2 * 2;
//
//                System.out.println(maximumNumberOfProblems);
//            }
//        }
//
//        private static int findProblemsEachUserCanSolve(int[] arrayOfProblems, int userLimit) {
//            int low = 0, high = arrayOfProblems.length;
//            while (low < high) {
//                int result = low + (high - low) / 2;
//                if (arrayOfProblems[result] <= userLimit) {
//                    low = result + 1;
//                } else {
//                    high = result;
//                }
//            }
//            return low;
//        }
//    }
//
//
//







package Constructoruniversity;
import java.util.Arrays;
import java.util.Scanner;

public class FairProblemSolving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int numberOfProblems = input.nextInt();
            int first = input.nextInt();
            int second = input.nextInt();

            int[] difficulties = new int[numberOfProblems];
            for (int index = 0; index < numberOfProblems; index++) {
                difficulties[index] = input.nextInt();
            }

            Arrays.sort(difficulties);

            int firstCount = findProblemsEachUserCanSolve(difficulties, first);
            int secondCount = findProblemsEachUserCanSolve(difficulties, second);

            int maximumNumberOfProblems = 0;
            if (firstCount > 0 && secondCount > 0) {
                maximumNumberOfProblems = Math.min(firstCount, secondCount) / 2 * 2;
            }
            System.out.println(maximumNumberOfProblems);
        }
    }

    private static int findProblemsEachUserCanSolve(int[] arrayOfProblems, int userLimit) {
        int low = 0, high = arrayOfProblems.length - 1;
        while (low <= high) {
            int result = low + (high - low) / 2;
            if (arrayOfProblems[result] <= userLimit) {
                low = result + 1;
            } else {
                high = result - 1;
            }
        }
        return low;
    }
}
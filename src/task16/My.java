package task16;

import java.util.Scanner;

public class My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String largeNumber = scanner.nextLine();

        String firstPart = "";
        String secondPart = "";
        String firstAlpha = "";
        String secondAlpha = "";
        int large = 0;
        int ans1 = -0;
        int ans2 = -0;

        while(ans1 == -0 || ans2 == -0) {

            System.out.println(secondPart);
            for (int i = 2; i <= largeNumber.length() - 2; i++) {
                String part1 = largeNumber.substring(0, i);
                String part2 = largeNumber.substring(i);

                if (!part1.startsWith("0") && !part2.startsWith("0")) {
                    firstPart = part1;
                    secondPart = part2;
                    break;
                }
            }

            int first = Integer.parseInt(String.valueOf(firstPart));
            int second = Integer.parseInt(String.valueOf(secondPart));

            for(int index = 2; index <= (first/2); index++) {
                if (first % index == 0) {
                    ans1 = -0;
                    break;
                }
                else{
                    firstAlpha = String.valueOf(first);
                    ans1 = 1;

                }
            }

            firstAlpha = String.valueOf(first);
//            ans1 = false;


            for(int index = 2; index <= (second/2); index++) {
                if (second % index == 0) {
                     ans2 = -0;
                    break;
                }
                else{
                    secondAlpha = String.valueOf(second);
                    ans2= 1;
                }
            }
//            if(ans1 ==1) {
//                secondAlpha = String.valueOf(second);
//                firstAlpha = String.valueOf(first);
//                System.out.println(firstAlpha + " and" + secondAlpha);
//            }
            if(ans1 == 1){
                System.out.println(largeNumber);
                large = Integer.parseInt(largeNumber);
                large++;
                System.out.println(large);
                largeNumber = String.valueOf(large);
                System.out.println(largeNumber);
            }


        }

        System.out.println(firstAlpha+secondAlpha);



    }
}

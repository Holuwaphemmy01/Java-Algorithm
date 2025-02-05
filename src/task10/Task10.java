package task10;

public class Task10 {

    public static int findSmallestInt(int[] args) {

        int smallestNumber = args[0];
        for (int index = 0; index < args.length; index++){
            if(args[index] <= smallestNumber) smallestNumber = args[index];
        }
        return smallestNumber;
    }

}

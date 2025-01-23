package task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OldestNumber {

    public int[] getTwoLargestNumber(int[] number) {
           Arrays.sort(number);
        return Arrays.copyOfRange(number, number.length-2, number.length);
    }
}

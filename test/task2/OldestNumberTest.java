package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldestNumberTest {

    @Test
    public void testToCheckOldestNumber() {
        OldestNumber oldestNumber = new OldestNumber();
        int [] number = {1, 14, 6, 9, 8};
        int [] response = oldestNumber.getTwoLargestNumber(number);
        int [] expected = {9, 14};
        assertArrayEquals(expected, response);
    }

}
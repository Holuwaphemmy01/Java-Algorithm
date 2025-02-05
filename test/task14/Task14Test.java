package task14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    private static final Task14 counter = new Task14();

    private static void doTest(Boolean[] input, int expected) {
        String message = String.format("for array: %s\n", Arrays.toString(input));
        int actual = counter.countSheeps(input);
        assertEquals(expected, actual, message);
    }

    @Test
    void sampleTests() {
        doTest(new Boolean[] {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true
        }, 17);
        doTest(new Boolean[] { false, true, true }, 2);
        doTest(new Boolean[] {}, 0);
        doTest(new Boolean[] { false, null, true, false, null, null, true}, 2);
        doTest(new Boolean[] { false, null, null}, 0);
    }

}
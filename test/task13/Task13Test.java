package task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Task13.reverse(5));
    }

}
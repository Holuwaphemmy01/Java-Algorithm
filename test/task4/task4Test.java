package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task4Test {

    @Test
    public void filterNumberInArray(){
        Task4 task4 = new Task4();
        int [] first = {1, 3, 5, 2, 5, 2, 7};
        int [] second = {2, 5};
        int [] response = {1, 3, 7};
        assertArrayEquals(response, task4.arrayDifferent(first, second));
    }

}
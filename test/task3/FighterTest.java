package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    @Test
    public  void testToFighters(){
        Fighter task3 = new Fighter();
        task3.setName("Fighter");
        task3.setHealth(10);
        task3.setDamagePerAttack(2);
        Fighter task4 = new Fighter();
        task4.setName("Fighter1");
        task4.setHealth(10);
        task4.setDamagePerAttack(4);

        Winner winner = new Winner();
        String response = winner.winner(task3, task4, "Fighter");
        assertEquals("Fighter1", response);
    }

}
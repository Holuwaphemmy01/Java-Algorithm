package task3;

public class Winner {


    public String winner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//        if(fighter1.getName().equalsIgnoreCase(firstAttacker)) {
//            int counter = fighter1.getHealth();
//             for (int count = 0; count < counter; count++) {
//                fighter2.setHealth(fighter2.getHealth() - fighter1.getDamagePerAttack());
//                fighter1.setHealth(fighter1.getHealth()- fighter2.getDamagePerAttack());
//                if(fighter1.getHealth() <= 0) return fighter2.getName();
//                if(fighter2.getHealth() <= 0) return fighter1.getName();
//            }
//        }
//
//
//            if(fighter2.getName().equalsIgnoreCase(firstAttacker)) {
//                int counter = fighter2.getHealth();
//                for (int count = 0; count < counter; count++) {
//                    fighter1.setHealth(fighter1.getHealth() - fighter2.getDamagePerAttack());
//                    fighter2.setHealth(fighter2.getHealth()- fighter1.getDamagePerAttack());
//                    if(fighter1.getHealth() <= 0) return fighter2.getName();
//                    if(fighter2.getHealth() <= 0) return fighter1.getName();
//                }
//            }
//            return null;

        Fighter currentAttacker = fighter1.getName().equalsIgnoreCase(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = currentAttacker == fighter1 ? fighter2 : fighter1;

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            defender.setHealth(defender.getHealth() - currentAttacker.getDamagePerAttack());
            if (defender.getHealth() <= 0) {
                return currentAttacker.getName();
            }

            currentAttacker = defender; // Switch attackers
            defender = currentAttacker == fighter1 ? fighter2 : fighter1;
        }

        return null; // This should never happen if both fighters have health
    }
}

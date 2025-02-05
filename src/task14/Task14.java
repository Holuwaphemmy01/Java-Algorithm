package task14;

public class Task14 {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int index = 0; index < arrayOfSheeps.length; index++){
            if(arrayOfSheeps[index] != null && arrayOfSheeps[index] == true) count++;
        }
        return count;
    }
}

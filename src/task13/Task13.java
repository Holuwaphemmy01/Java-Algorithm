package task13;

public class Task13 {
    public static int[] reverse(int n){
        int [] result = new int [n];
        for(int index = 0; index < n; index++){
            result[index] = n - index;
        }
        return result;
    }

}

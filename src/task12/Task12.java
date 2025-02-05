package task12;

public class Task12 {
    public static String findNeedle(Object[] haystack) {
        int foundIndex=0;
        for (int index = 0; index < haystack.length; index++){
            if(haystack[index]== null) continue;
            if (haystack[index].toString().equals("needle")) foundIndex = index;
        }
        return "found the needle at position "+foundIndex;
    }
}

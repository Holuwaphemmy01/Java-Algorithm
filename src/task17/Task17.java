package task17;
import java.util.*;

public class Task17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        if (n < 3) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(i, j);
                String s3 = s.substring(j);

                if (distinctCount(s1) == distinctCount(s2) && distinctCount(s2) == distinctCount(s3)) {
                    System.out.println("YES");
                    System.out.println(i + " " + (j - i) + " " + (n - j));
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    private static int distinctCount(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size();

            }


}

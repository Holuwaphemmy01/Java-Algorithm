package task19;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task19 t = new Task19();
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        System.out.println(t.countLastWord(sentence));
    }


    public int countLastWord(String s) {
        int count=0;
        for(int index=s.length()-1;index>=0;index--){

            if(s.charAt(index)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}

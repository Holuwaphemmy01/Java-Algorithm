package task20;

import task12.Task12;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();

        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);

        Task20 task20 = new Task20();
        System.out.println(task20.lastAndReverseIndex(word, character));
    }

    public String lastAndReverseIndex(String word,char ch ) {
         String newWord = "";

         for(int index = 0; index < word.length(); index++) {
             if(word.charAt(index) == ch) {
                 for(int count = index; count >=0; count--) {
                     newWord += word.charAt(count);
                 }

             }
         }
         for (int count = newWord.length(); count < word.length(); count++) {
             newWord += word.charAt(count);
         }

        return newWord;
    }
}

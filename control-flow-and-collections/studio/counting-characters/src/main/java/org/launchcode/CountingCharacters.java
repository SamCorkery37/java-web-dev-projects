package org.launchcode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingCharacters {


        public static void main (String[] args)
        {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a word: ");

            String userWord = userInput.nextLine();

            String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

            HashMap<Character, Integer> userCount = new HashMap<>();
            for (int i = userWord.length() - 1; i >= 0; i--) {
                if (userCount.containsKey(str.charAt(i))) {
                    int count = userCount.get(str.charAt(i));
                    userCount.put(str.charAt(i), ++count);
                } else {
                    userCount.put(str.charAt(i), 1);
                }
            }
            System.out.println(userCount);

            System.out.println("--------------------------");

            HashMap<Character, Integer> charCount = new HashMap<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (charCount.containsKey(str.charAt(i))) {
                    int count = charCount.get(str.charAt(i));
                    charCount.put(str.charAt(i), ++count);
                } else {
                    charCount.put(str.charAt(i), 1);
                }
            }
            System.out.println(charCount);
        }
    }



package org.exercise.main;

import org.exercise.utility.CharCounter;
import java.util.Map;
import java.util.Scanner;

public class CharCounterMain {
    public static void main(String[] args) {
        //Initializing scanner obj
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to map:");
        String word = scanner.nextLine();
        scanner.close();
        Map<Character, Integer> charCountMap = CharCounter.countChars(word);

        System.out.println("Total character count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Mapping completed, program closed...");

    }

}

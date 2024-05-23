package org.exercise.utility;

import org.exercise.model.Gift;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "giftList.txt";

    public static void loadGiftList(ArrayList<Gift> giftList) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                giftList.add(new Gift(line));
            }
        } catch (IOException e) {
            System.out.println("Files list not found. I'll create a new list...");
        }
    }

    public static void saveGiftList(ArrayList<Gift> giftList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Gift gift : giftList) {
                writer.write(gift.getGiftName());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving list: " + e.getMessage());
        }
    }
}

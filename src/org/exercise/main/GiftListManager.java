package org.exercise.main;

import org.exercise.utility.GiftFileHandler;
import org.exercise.model.Gift;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GiftListManager {
    public static void main(String[] args) {
        ArrayList<Gift> giftList = new ArrayList<>();

        //Loading list from file
        GiftFileHandler.loadGiftList(giftList);

        //Initializing scanner obj
        Scanner scanner = new Scanner(System.in);

        //Utility variables
        String giftName;
        boolean addingGift = true;

        //Inserting the user's gifts
        while (addingGift){
            System.out.println("Enter the gift name: ");
            giftName = scanner.nextLine();
            giftList.add(new Gift(giftName));
            System.out.println("Current list length: " + giftList.size());

            System.out.println("Do you want to add another gift to the list? (y/n)");
            String r = scanner.nextLine();
            if (r.equalsIgnoreCase("n")){
                addingGift = false;
            }
        }
        scanner.close();

        //Sorting the list
        giftList.sort(Comparator.comparing(Gift::getGiftName));

        //Printing sorted list
        System.out.println("Sorted gifts list");
        for (Gift g : giftList) {
            System.out.println(g);
        }

        //Saving sorted list to text file
        GiftFileHandler.saveGiftList(giftList);
    }
}

/*
 * Created on 2024-09-20
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Scanner;

public class App {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cat cat1 = createCat();
        Cat cat2 = createCat();

        // TODO: some LAB04 code goes here

        myScanner.close();
    }

    // Suggestion for LAB04: create a method to create a new owner.

    public static Cat createCat() {
        System.out.println("What is your cat's name?");
        String name = myScanner.nextLine();

        System.out.println("Your cat says what?");
        String catSound = myScanner.nextLine();

        System.out.println("Tell a funny story about your cat!");
        String funnyStory = myScanner.nextLine();

        System.out.println("Is your cat always hungry? (1 for yes, 2 for no)");

        int hungryNumber = 0;
        hungryNumber = myScanner.nextInt();
        // The following line is necessary to ignore the "enter" token the user inputs after typing in an integer 
        myScanner.nextLine();

        boolean isHungry = (hungryNumber == 1);
        System.out.println("Meet " + name + ", it says " + catSound + "!\n");
        return new Cat(name, catSound, funnyStory, isHungry);
    }
}

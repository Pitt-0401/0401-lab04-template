/*
 * Created on 2024-09-20
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class Cat {
    // Note: This class was simplified for LAB04.
    private String name;
    private String sound;
    private String funnyStory;
    boolean isHungry;

    // Constructors
    public Cat(String name, String sound, String funnyStory) {
        this.name = name;
        this.sound = sound;
        this.funnyStory = funnyStory;
        this.isHungry = true; // Cats are hungry by default
    }

    public Cat(String name, String sound, String funnyStory, boolean isHungry) {
        this.name = name;
        this.sound = sound;
        this.funnyStory = funnyStory;
        this.isHungry = isHungry;
    }

    // Cat behavior
    public void meow() {
        System.out.println(this.name + " says: " + this.sound + "!");
    }

    public void printFunnyStory() {
        System.out.println("Here is a funny story about " + this.name + ": \n" + this.funnyStory);

    }

    public void feed() {
        if (this.isHungry) {
            System.out.println(this.name + " was fed.");
        } else {
            System.out.println(this.name + " is not hungry at the moment.");
        }
        this.isHungry = !this.isHungry;
    }
}

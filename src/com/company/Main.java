package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        game game = new game("NoobSlayer", "Dragon Fighter");
        level level1 = new level(10, 3, "a tutorial level", 15, 30);
        item sword = new item("Sword", "basic sword", 10, 10);

        System.out.println("Welcome to " + game.getName() + " the mighty " + game.getPlayerName() + "!");
        System.out.println("This is " + level1.getDescription() + "!");
        System.out.println("Their are " + level1.getNumberOfEnemies() + " enemies in this level.");
        System.out.println("You have a basic sword with " + sword.getDurability() + " durability.");
        System.out.println("Would you like to attack? (y/n)");
        while(game.getPlayerHealth() > 0 && level1.getNumberOfEnemies() > 0){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("y")) {
            System.out.println("You attack the enemy!");
            //random number 1 or 2
            int randomNumber = (int) (Math.random() * 2) + 1;
            if (randomNumber == 1) {
                sword.use();
            sword.damageToEnemy(10);
            System.out.println("You kill an enemy!");
            level1.setNumberOfEnemies(level1.getNumberOfEnemies() - 1);
            System.out.println("There are " + level1.getNumberOfEnemies() + " enemies left.");
            //random number 1 or 2
            int randomNumber2 = (int) (Math.random() * 2) + 1;
            if (randomNumber2 == 1) {
                System.out.println("You found a new sword!");
                sword.setDurability(sword.getDurability() + 10);
                System.out.println("Your sword now has " + sword.getDurability() + " durability.");

            }
            }
            else {
                System.out.println("You miss the enemy!");
                System.out.println("You take 10 damage!");
                game.playerDamage(10);
                System.out.println("You have " + game.getPlayerHealth() + " health left.");
            }
            System.out.println("Your sword has " + sword.getDurability() + " durability left.");
        }
        else {
            System.out.println("The enemy attacks you!");
            game.playerDamage(5);
            System.out.println("You block and take 5 damage!");
            System.out.println("You have " + game.getPlayerHealth() + " health left.");
        }
            System.out.println("Would you like to attack? (y/n)");
        }

    }



}

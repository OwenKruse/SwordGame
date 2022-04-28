package com.company;

public class game {
    private int playerLevel;
    private int playerHealth;
    private final String playerName;
    private String name;
    game(String playerName, String name) {
        this.playerName = playerName;
        this.playerLevel = 1;
        this.playerHealth = 100;
        this.name = name;
    }
    public void levelUp() {
        this.playerLevel += 1;
    }
    public void playerDamage(int damage) {
        this.playerHealth -= damage;
    }
    public void playerHeal(int heal) {
        this.playerHealth += heal;
    }
    public String getName() {
        return this.name;
    }
    public String getPlayerName() {
        return this.playerName;
    }
    public int getPlayerLevel() {
        return this.playerLevel;
    }
    public int getPlayerHealth() {
        return this.playerHealth;
    }

    public void playerInfo() {
        System.out.println("Name: " + this.playerName);
        System.out.println("Level: " + this.playerLevel);
        System.out.println("Health: " + this.playerHealth);
    }
}

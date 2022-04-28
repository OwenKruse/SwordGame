package com.company;

public class item {
    private String name;
    private String description;
    private int damage;
    private int durability;
    public item(String name, String description, int durability, int damage) {
        this.name = name;
        this.description = description;
        this.durability = durability;
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getDamage() {
        return damage;
    }
    public int getDurability() {
        return durability;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public void use() {
        durability--;
    }
    public int damageToEnemy(int enemyHealth) {
        return enemyHealth - damage;
    }
    public void print() {
        System.out.println(name);
        System.out.println(description);
        System.out.println("Durability: " + durability);
        System.out.println("Damage: " + damage);
    }

}

package com.company;

public class level {
    public int numberOfEnemies;
    public int levelOfDifficulty;
    public String description;
    public int width;
    public int height;

    public level(int numberOfEnemies, int levelOfDifficulty, String description, int width, int height) {
        this.numberOfEnemies = numberOfEnemies;
        this.levelOfDifficulty = levelOfDifficulty;
        this.description = description;
    }

    public int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    public void setNumberOfEnemies(int numberOfEnemies) {
        this.numberOfEnemies = numberOfEnemies;
    }

    public int getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(int levelOfDifficulty) {
        this.levelOfDifficulty = levelOfDifficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int totalDifficulty(){
        return levelOfDifficulty*numberOfEnemies;
    }
    public int area(){
        return width*height;
    }
}

package com.narxoz.rpg.characters;

public abstract class GameCharacter {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    public GameCharacter(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;

    }public abstract void useSpecialAbility();

        public void getStats() {
            System.out.println("Name: " + name + " | HP: " + health + " | Mana: " + mana +
                    " | Str: " + strength + " | Int: " + intelligence);
        }
}
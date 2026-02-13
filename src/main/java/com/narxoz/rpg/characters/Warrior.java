package com.narxoz.rpg.characters;

public class Warrior extends GameCharacter {
    private String name;
    public Warrior(String name) { super(name, 150, 20, 15, 5); }
    public void useSpecialAbility() {
        System.out.println("Special Ability: Shield Bash - Stuns the enemy!");
    }
}

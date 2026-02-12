package com.narxoz.rpg.characters;

public class Warrior implements GameCharacter {
    private String name;
    public Warrior(String name) { this.name = name; }
    @Override
    public void getStats() {
        System.out.println(name + " [Warrior] - HP: 150, Mana: 20, Str: 18, Int: 5");
    }
    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Shield Bash - Stuns the enemy!");
    }
}

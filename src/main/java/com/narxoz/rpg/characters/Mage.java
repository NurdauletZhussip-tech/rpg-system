package com.narxoz.rpg.characters;

public class Mage extends GameCharacter {
    private String name;
    public Mage(String name) { super(name, 60, 100, 5, 20); }
    public void useSpecialAbility() {
        System.out.println("Special Ability: Fireball - Massive area damage!");
    }
}
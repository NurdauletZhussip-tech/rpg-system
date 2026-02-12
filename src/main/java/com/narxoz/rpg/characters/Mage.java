package com.narxoz.rpg.characters;

public class Mage implements GameCharacter {
    private String name;
    public Mage(String name) { this.name = name; }

    @Override
    public void getStats() {
        System.out.println(name + " [Mage] - HP: 70, Mana: 150, Str: 4, Int: 20");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Fireball - Massive area damage!");
    }
}
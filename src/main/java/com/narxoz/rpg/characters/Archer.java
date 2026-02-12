package com.narxoz.rpg.characters;

public class Archer implements GameCharacter {
    private String name;
    public Archer(String name) { this.name = name; }
    @Override
    public void getStats() {
        System.out.println(name + " [Archer] - HP: 100, Mana: 60, Str: 10, Int: 10");
    }
    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Volley - Rains arrows on targets!");
    }
}
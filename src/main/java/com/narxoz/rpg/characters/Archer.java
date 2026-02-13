package com.narxoz.rpg.characters;

public class Archer extends GameCharacter {
    private String name;
    public Archer(String name) { super(name, 150, 20, 15, 5);}
    public void useSpecialAbility() {
        System.out.println("Special Ability: Volley - Rains arrows on targets!");
    }
}
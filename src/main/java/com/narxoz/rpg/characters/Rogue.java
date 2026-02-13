package com.narxoz.rpg.characters;

public class Rogue extends GameCharacter{
    private String name;
    public Rogue(String name){
        super(name,150,70,20,100);
    }
    public void useSpecialAbility(){System.out.println("Stopping time");}
}

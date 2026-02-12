package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Archer;
import com.narxoz.rpg.characters.GameCharacter;
import com.narxoz.rpg.characters.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public GameCharacter createCharacter(String name){ return new Mage(name); }
}

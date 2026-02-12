package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Archer;
import com.narxoz.rpg.characters.GameCharacter;

public abstract class CharacterFactory {
    public abstract GameCharacter createCharacter(String name);
}
package com.narxoz;

import com.narxoz.rpg.characters.GameCharacter;
import com.narxoz.rpg.characters.factory.ArcherFactory;
import com.narxoz.rpg.characters.factory.CharacterFactory;
import com.narxoz.rpg.characters.factory.MageFactory;
import com.narxoz.rpg.characters.factory.WarriorFactory;
import com.narxoz.rpg.equipments.Armor;
import com.narxoz.rpg.equipments.Weapon;
import com.narxoz.rpg.equipments.factory.EquipmentFactory;
import com.narxoz.rpg.equipments.factory.MagicFactory;
import com.narxoz.rpg.equipments.factory.MedievalFactory;
import com.narxoz.rpg.equipments.factory.RangerFactory;

class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character Creation System ===\n");

        // 1. Create a Warrior with Medieval Gear
        createAndEquipCharacter(new WarriorFactory(), new MedievalFactory(), "Thorin");

        System.out.println("\n---\n");

        // 2. Create a Mage with Magic Gear
        createAndEquipCharacter(new MageFactory(), new MagicFactory(), "Gandalf");

        System.out.println("\n---\n");

        // 3. Create an Archer with Ranger Gear
        createAndEquipCharacter(new ArcherFactory(), new RangerFactory(), "Legolas");
    }

    // This method demonstrates the power of the patterns.
    // It doesn't care WHAT character or WHAT equipment is passed, as long as they fit the interfaces.
    public static void createAndEquipCharacter(CharacterFactory charFactory, EquipmentFactory equipFactory, String name) {
        // Factory Method in action
        GameCharacter character = charFactory.createCharacter(name);
        System.out.println("Creating " + character.getClass().getSimpleName() + "...");
        character.getStats();
        character.useSpecialAbility();

        // Abstract Factory in action
        System.out.println("Equipping with " + equipFactory.getClass().getSimpleName().replace("Factory", "") + " Set...");
        Weapon weapon = equipFactory.createWeapon();
        Armor armor = equipFactory.createArmor();

        weapon.attack();
        armor.defend();
    }
}
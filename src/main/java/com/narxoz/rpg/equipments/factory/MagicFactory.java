package com.narxoz.rpg.equipments.factory;

public class MagicFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new Staff(); }
    public Armor createArmor() { return new Robe(); }
}

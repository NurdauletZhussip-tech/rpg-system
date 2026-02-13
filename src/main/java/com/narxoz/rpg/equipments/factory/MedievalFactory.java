package com.narxoz.rpg.equipments.factory;

import com.narxoz.rpg.equipments.Armor;
import com.narxoz.rpg.equipments.Weapon;
import com.narxoz.rpg.equipments.concrete.IronSword;
import com.narxoz.rpg.equipments.concrete.PlateArmor;

public class MedievalFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() { return new IronSword(); }
    @Override
    public Armor createArmor() { return new PlateArmor(); }
}

package com.narxoz.rpg.equipments.factory;

import com.narxoz.rpg.equipments.Armor;
import com.narxoz.rpg.equipments.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}
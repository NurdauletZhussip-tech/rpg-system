package com.narxoz.rpg.equipments.factory;

import com.narxoz.rpg.equipments.Armor;
import com.narxoz.rpg.equipments.Weapon;
import com.narxoz.rpg.equipments.concrete.EnchantedRobe;
import com.narxoz.rpg.equipments.concrete.Staff;

public class MagicFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new Staff(); }
    public Armor createArmor() { return new EnchantedRobe(); }
}

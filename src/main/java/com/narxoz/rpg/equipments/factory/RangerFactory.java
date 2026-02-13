package com.narxoz.rpg.equipments.factory;
import com.narxoz.rpg.equipments.Armor;
import com.narxoz.rpg.equipments.Weapon;
import com.narxoz.rpg.equipments.concrete.LeatherArmor;
import com.narxoz.rpg.equipments.concrete.LongBow;

public class RangerFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new LongBow();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}

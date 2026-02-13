package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Armor;

public class EnchantedRobe implements Armor {
    public String getArmorInfo() { return "Enchanted Robes (Mana Boost: 25)"; }
    @Override
    public void defend() { System.out.println("defense:10"); }
}

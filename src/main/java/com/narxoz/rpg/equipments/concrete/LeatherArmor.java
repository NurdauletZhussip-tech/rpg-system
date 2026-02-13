package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Armor;

public class LeatherArmor implements Armor {
    public String getArmorInfo() { return "Leather Armor"; }
    @Override
    public void defend() {
        {
            System.out.println("Armor: Leather Armor (Defense: 20, Agility Bonus)");

        }
    }}

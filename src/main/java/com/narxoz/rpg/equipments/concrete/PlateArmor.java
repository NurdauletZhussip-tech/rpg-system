package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Armor;

public class PlateArmor implements Armor {
    public String getArmorInfo() { return "Plate Armor"; }

    @Override
    public void defend() {
            System.out.println("Armor: Plate Armor (Defense: 30)");
        }
    }


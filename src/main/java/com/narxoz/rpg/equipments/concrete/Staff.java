package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Weapon;

public class Staff implements Weapon {
    public String getWeaponInfo() { return "Wizard Staff"; }
    public int getDamage() { return 15; }
}

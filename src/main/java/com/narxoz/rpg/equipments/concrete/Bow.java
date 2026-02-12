package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Weapon;

class Bow implements Weapon {
    public String getWeaponInfo() { return "Bow"; }
    public int getDamage() { return 20; }
}

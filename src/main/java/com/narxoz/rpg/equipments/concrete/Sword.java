package com.narxoz.rpg.equipments.concrete;
import com.narxoz.rpg.equipments.Weapon;

public class Sword implements Weapon {
    public String getWeaponInfo() { return "Iron Sword"; }
    public int getDamage() { return 25; }
}

package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Weapon;

public class Staff implements Weapon {
    public String getWeaponInfo() { return "Wizard Staff"; }
    @Override
    public void attack() { System.out.println("Attack 15"); }
}

package com.narxoz.rpg.equipments.concrete;

import com.narxoz.rpg.equipments.Weapon;

public class LongBow implements Weapon {
    public String getWeaponInfo() { return "LongBow"; }
    @Override
    public void attack() { System.out.println("attack: 30"); }
}

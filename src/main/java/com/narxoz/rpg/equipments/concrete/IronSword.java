package com.narxoz.rpg.equipments.concrete;
import com.narxoz.rpg.equipments.Weapon;

 public class IronSword implements Weapon {
    public String getWeaponInfo() { return "IronSword"; }
    @Override
    public void attack() {
        System.out.println("Attack:25");
    }
}

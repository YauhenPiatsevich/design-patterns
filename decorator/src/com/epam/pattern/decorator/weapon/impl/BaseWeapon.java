package com.epam.pattern.decorator.weapon.impl;

import com.epam.pattern.decorator.weapon.Weapon;

public class BaseWeapon implements Weapon {

    @Override
    public void construct() {
        System.out.println("Constructing base weapon...");
    }

    @Override
    public String getDescription() {
        return "Base weapon model";
    }
}

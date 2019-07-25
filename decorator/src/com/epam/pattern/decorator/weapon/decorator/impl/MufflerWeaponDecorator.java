package com.epam.pattern.decorator.weapon.decorator.impl;

import com.epam.pattern.decorator.weapon.Weapon;
import com.epam.pattern.decorator.weapon.decorator.WeaponDecorator;

public class MufflerWeaponDecorator extends WeaponDecorator {

    public MufflerWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void construct() {
        super.construct();
        // weapon.addMuffler()
        System.out.println("Adding muffler...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including muffler";
    }
}

package com.epam.pattern.decorator.weapon.decorator.impl;

import com.epam.pattern.decorator.weapon.Weapon;
import com.epam.pattern.decorator.weapon.decorator.WeaponDecorator;

public class CollimatorWeaponDecorator extends WeaponDecorator {

    public CollimatorWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void construct() {
        super.construct();
        // weapon.addCollimator()
        System.out.println("Adding collimator sight...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including collimator sight";
    }
}

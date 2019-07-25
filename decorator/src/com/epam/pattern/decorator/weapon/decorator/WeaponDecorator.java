package com.epam.pattern.decorator.weapon.decorator;

import com.epam.pattern.decorator.weapon.Weapon;

public class WeaponDecorator implements Weapon {

    protected final Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void construct() {
        weapon.construct();
    }

    @Override
    public String getDescription() {
        return weapon.getDescription();
    }
}

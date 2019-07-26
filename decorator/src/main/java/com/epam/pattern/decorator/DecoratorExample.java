package com.epam.pattern.decorator;

import com.epam.pattern.decorator.weapon.Weapon;
import com.epam.pattern.decorator.weapon.decorator.impl.CollimatorWeaponDecorator;
import com.epam.pattern.decorator.weapon.decorator.impl.MufflerWeaponDecorator;
import com.epam.pattern.decorator.weapon.impl.BaseWeapon;

public class DecoratorExample {

    public static void main(String[] args) {
        Weapon baseWeapon = new BaseWeapon();
        baseWeapon.construct();
        System.out.println("We constructed: " + baseWeapon.getDescription());

        Weapon decoratedWeapon = new MufflerWeaponDecorator(new CollimatorWeaponDecorator(baseWeapon));
        decoratedWeapon.construct();
        System.out.println("We constructed: " + decoratedWeapon.getDescription());
    }
}

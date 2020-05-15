package ru.job4j.oop.encapsulation;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Ilya Shurakov ");
        license.setModel("Ford");
        license.setCode("xx111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + "has a car - " + license.getModel() + " : " + license.getCode());
    }
}

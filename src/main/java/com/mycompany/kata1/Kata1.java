package com.mycompany.kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person persona = new Person("Zacarías", new Date(102,10,25));
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años.");
    }
}

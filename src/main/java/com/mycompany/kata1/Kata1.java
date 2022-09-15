package com.mycompany.kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 8, 14);
        Person persona = new Person("Zacarías", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años.");
    }
}

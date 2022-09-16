package com.mycompany.kata1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002,9,14);
        Person persona = new Person("Zacarías", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años.");
    }
}

package com.codecool;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Person a = new Person("Joli",150,34);
        Person b = new Person("Zoli",230,11);
        Person c = new Person("Poli",180,22);
        Person d = new Person("Moli",167,25);
        System.out.println(a.getName());
        for (String hobby : a.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println();
        System.out.println(b.getName());
        for (String hobby : b.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println();
        System.out.println(c.getName());
        for (String hobby : c.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println();
        System.out.println(d.getName());
        for (String hobby : d.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println();
    
        List<Person> people = new ArrayList<>(Arrays.asList(a,b,c,d));
        Collections.sort(people,new PersonComperator(Attribute.HOBBIES));
        System.out.println(people.get(0).getName());
    }
}

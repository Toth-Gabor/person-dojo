package com.codecool;

import java.util.Comparator;

public class PersonComperator implements Comparator<Person> {
    
    private Attribute a;
    
    public PersonComperator(Attribute a){
        this.a = a;
    }
    
    @Override
    public int compare(Person o1, Person o2) {
        
        switch (a){
            case AGE:
                return o1.getAge() - o2.getAge();
            case HEIGHT:
                return o1.getHeight() - o2.getHeight();
            case HOBBIES:
                return o1.getHobbies().size() - o2.getHobbies().size();
                default:
                    throw new IllegalStateException("This will newer happen!");
        }
    }
}

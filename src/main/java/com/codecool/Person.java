package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Person {
    
    private String name;
    private int height;
    private int age;
    private List<String> hobbies;
    private Random rnd = new Random();
    
    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.hobbies = generateHobbies(rnd.nextInt(5)-1);
    }
    
    public String getName() {
        return name;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getAge() {
        return age;
    }
    
    public List<String> getHobbies() {
        return hobbies;
    }
    
    private List<String> generateHobbies(int num){
        List<String> hobbies = new ArrayList<>(Arrays.asList("baking","hiking","swimming","walking","climbing rocks", "photography"));
        List<String> randomHobbies = new ArrayList<>();
        
        for (int i = 0; i < num; i++) {
            int rndNum = rnd.nextInt(hobbies.size());
            if(!randomHobbies.contains(hobbies.get(rndNum))){
                randomHobbies.add(hobbies.get(rndNum));
            } else {
                rndNum = rnd.nextInt(hobbies.size());
                i--;
            }
        }
        return randomHobbies;
    }
}

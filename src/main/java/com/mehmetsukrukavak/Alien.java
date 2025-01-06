package com.mehmetsukrukavak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;

    private Computer computer;

    @Value("Alien")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
     //   System.out.println("Setter called.");
        this.age = age;
    }

  /*  public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
        System.out.println("Object Created.");
    }

   /* @ConstructorProperties( {"name", "laptop"})
    public Alien(String name, Laptop laptop) {
        System.out.println("Para Object Created.");
        this.name = name;
        this.laptop = laptop;
    }*/

    public void code(){
        System.out.println("Coding...");
        computer.compile();
    }
}

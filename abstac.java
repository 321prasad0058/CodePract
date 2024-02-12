import java.util.*;

public class abstac 
{
    public static void main(String args[])
    {
        newAnimal a = new newAnimal();
        a.eat();
        a.walk();
    }
}

abstract class Animal
{
    void eat()
    {
        System.out.println("Eats everything");
    }

    abstract void walk();
}

class newAnimal extends Animal
{
    void walk()
    {
        System.out.println("Can Walk");
    }
}


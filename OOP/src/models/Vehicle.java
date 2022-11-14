package models;

public interface Vehicle {

    //Interfaces can ONLY have abstract methods. No implemented methods (we IMPLEMENT interfaces)

    //We can have initialized variables
    int tankSize = 5;

    //all interface methods are public abstract by default
    void drive(int speed);

}

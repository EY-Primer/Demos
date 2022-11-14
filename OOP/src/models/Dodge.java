package models;

//Prime example of inheritance - Dodge extends Car so it has access to all of the members of the Car Class
//in other words, Dodge inherits the members of the Car Class.
//Inheritance is also Polymorphism!! Dodge is a "different form" of the Car Class
public class Dodge extends Car{

    //we don't need to explicity initialize the variables from Car or Vehicle
    //due to inheritance, we automatically have access to those variables

    //remember method OVERRIDING is another form of polymorphism
    @Override
    public void honk() {
        System.out.println("DODGE goes honk");
    }

    @Override
    public void drive(int speed) {
        System.out.println("DODGE drove at " + speed + " mph");
    }

    //we automatically have a no args constructor, just a typical java convenience

    public Dodge() {
        super();
    }

    //calling the all args constructor of Car (super(int, int, int);)
    public Dodge(int tires, int speed, int seats) {
        super(tires, speed, seats);
    }

}

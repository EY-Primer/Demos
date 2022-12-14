import models.Dodge;

public class Driver {

    public static void main(String[] args) {

        //overview: This Dodge class extends an abstract class, which implements in interface

        Dodge dodge = new Dodge(4, 180, 6);

        //we have access to the inherited methods we implemented of course
        dodge.drive(dodge.getSpeed()); //using the getter to get the speed (encapsulation)
        dodge.honk();

        //we have access to the three fields in the car abstract class
        System.out.println(dodge.getTires());

        //we have access to this field that was declared way up in the Interface
        System.out.println(dodge.tankSize);

        //we can't instantiate abstract classes or interfaces
        //Car car = new Car();

        System.out.println(dodge); //the toString was implement in the Car abstract class
        //notice it says Car not Dodge


        //Where does abstraction fit in here?
        //we are calling all of these method without needing to know how they were implemented (coded)
        //someone who has never seen this codebase can assume what drive() and honk() do
        //like driving a car - you know the gas pedal makes the car go, but not necessarily HOW.

    }

}

package models;

public abstract class Car implements Vehicle{

    //encapsulation involes private fields and getters and setters
    //the point is that you don't want any data changing without your authoriztion (get/set)
    //any users or devs cannot change this fields UNLESS the getters and setters are used

    //Step 1 in encapsulation - private fields
    private int tires;
    private int speed;
    private int seats;

    //we implemented this method from the Vehicle Interface
    public void drive(int speed){
        System.out.println("Car drove at " + speed + " MPH");
    }

    //MAIN difference between Abstract Classes and Interfaces are the ability to have concrete methods
    //we could have left that drive() class unimplemented

    public abstract void honk(); //we will OVERRIDE this in the Dodge class (another form of polymorphism)


    //boilerplate code---------------------------------------

    //These two constructors are one example of polymorphism - method overloading
    //same method signature, but different parameters

    public Car(){
        super(); //super calls to the parent construction - it's actually called implicitly
        //Car does not extend any class (at least not explicitly) so the Object Class constructor is called
    }

    public Car(int tires, int speed, int seats) {
        //notice I didn't call super(); explicitly, it still happens implicitly
        this.tires = tires;
        this.speed = speed;
        this.seats = seats;
    }

    //Step 2 in encapsulation - make getters and setters (the only way to access or change these fields)
    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    //need this if we want to print more than just a memory address
    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                ", speed=" + speed +
                ", seats=" + seats +
                '}';
    }
}


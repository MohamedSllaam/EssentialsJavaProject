public class Car {

    String make = "Ford";
    String Model= "Mustang";
    int year = 2025;
    double preice = 5666.99;
    boolean isRunning =false;

    void start(){
        isRunning= true;
        System.out.println("You start the end");
    }
    void  stop(){
        isRunning= false;
        System.out.println("You stop the end");
    }

    void drive()
    {
        System.out.println("You drive the "+Model);
    }

    void brake()
    {
        System.out.println("You brake the "+Model);
    }
}

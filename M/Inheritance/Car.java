package M.Inheritance;

/* Open Car
   Start Engine
   Drive
   Stop
   Lock
 */
public class Car extends Vehicle{

    void openCar(){
        System.out.println("Car--------------------------Open the Door");
    }
    void startEngine(){
        System.out.println("Car--------------------------Start Engine");
    }
    void driveCar(){
        System.out.println("Car--------------------------Drive");
    }
    void stopCar(){
        System.out.println("Car--------------------------Stop");
    }
    void lockCar(){
        System.out.println("Car--------------------------Lock");
    }

}

package M.Inheritance;

public class RunTest {

    public static void main(String[] args) {
        Car c =new Car();
        c.openCar();
        c.startEngine();
        c.driveCar();
        c.stopCar();
        c.lockCar();
        c.speedOfVehicle();

        System.out.println("Tesla Car");
        Tesla t=new Tesla();
        t.openCar();
        t.startEngine();
        t.driveCar();
        t.stopCar();
        t.lockCar();
        t.parkingCharge();

        System.out.println("BMW Car");
        BMW b=new BMW();
        b.openCar();
        b.startEngine();
        b.driveCar();
        b.stopCar();
        b.lockCar();

        System.out.println("Honda Car");
        Honda h=new Honda();
        h.openCar();
        h.startEngine();
        h.driveCar();
        h.stopCar();
        h.lockCar();
        h.numberOfWheels();

        System.out.println("Bike");
        Bike b1=new Bike();
        b1.speedOfVehicle();
        b1.numberOfWheels();
        b1.parkingCharge();
    }
}

package ClassLearningExamples.I.Object;

public class Car {
//Example 1:
    int x=5;

//    public static void main(String[] args) {
////        Create an Object to access a variable
//
//        Car obj = new Car(); // Create a class object
//        System.out.println(obj.x);
//
//
//    }

//Example 2:
    int mod;
    double Wheel;

    public static void main(String[] args) {

        Car obj1 =new Car();
        obj1.mod =2019;
        obj1.Wheel =5;

        System.out.println(obj1.mod);
        System.out.println(obj1.Wheel);

    }

}


package ClassLearningExamples.K.Constructors;

public class Const {
    int a; //Class attributes

    Const(){
        a=5; //Set the initial value
    }


    public static void main(String[] args) {
//Create an object
        Const myobj = new Const();
        System.out.println(myobj.a);

    }
}

package ClassLearningExamples.J.Method;

public class MethodParameters {

//    //Static parameters method
//    static void myMethod(String fname, int age){
//
//        System.out.println(fname+ " " +age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Tester",34);
//    }

//   NonStatic parameters method
        void myMethod(String fname, int age){

        System.out.println(fname+ " " +age);
    }
    public static void main(String[] args) {
       MethodParameters methodParameters = new MethodParameters();
       methodParameters.myMethod("Tester",34);
    }



}

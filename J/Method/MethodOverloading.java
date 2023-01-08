package ClassLearningExamples.J.Method;

public class MethodOverloading {

    static int plusMethod(int x,int y){
       return x+y;
    }

    static double plusMethod(double x, double y){
       return x+y;
    }


    public static void main(String[] args) {
        int z = plusMethod(10,20);
       double zz = plusMethod(40,50);

        System.out.println(z);
        System.out.println(zz);


    }
}

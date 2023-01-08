package ClassLearningExamples.J.Method;

public class NonStaticMethod {

    void myMethod(){
        System.out.println("My Nonstatic Method");
    }


    public static void main(String[] args) {
        NonStaticMethod nonStaticMethod = new NonStaticMethod();
        nonStaticMethod.myMethod();

    }
}

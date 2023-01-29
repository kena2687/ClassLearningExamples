package P.Wrapper;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        //P to W
        int a=10;

        Integer aa = new Integer(a); //Boxing Wrapper Class

        //W to P
        Integer bb=a; //Unboxing Wrapper Class

        int b= bb.intValue(); //Unboxing

        int c=bb; //Auto unboxing

//  Use a wrapper class
        ArrayList <Integer> values = new ArrayList<>();
        values.add(5);

    }
}

package ClassLearningExamples.AllDataType;

public class DataType {
    public static void main(String[] args) {
        //Range is -128 to 127
        byte a = -122;
        System.out.println("a:"+a);

        //Range is -32768 to 32767
        short b = 500;
        System.out.println("b:"+b);

        //Range is -2147483648 to 2147483647
        int c = 10000;
        System.out.println("c:"+c);

        //Range is 9,223,372,036,854,778,888 to 9,223,372,036,854,778,887
        long d = 5000;
        System.out.println("d:"+d);

        //Range is 3,4E-38 to 3.4E+38
        //Always use f in last for float
        float e = -1.1f;
        System.out.println("e:"+e);

        //Range is 1.8 * (10)308
        double f = 1.8;
        System.out.println("f:"+f);

        //Range is Single Value (Unique Code)
        char g = 5;
        System.out.println("g:"+g);

        // True or False Fix Value
        boolean h = true;
        System.out.println("h:"+h);

        //No Primitive Data type
        //Range is 0 to 2147483647
        String j = "Software Testing";
        System.out.println("j:"+j);





    }
}

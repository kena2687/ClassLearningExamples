package B.DataTypes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DataTypes {

    public static void main(String[] args) {

//Integer Family
//Byte range is -128 to 127
        byte a = -125;
        System.out.println("a:"+a);

//Short Range is -32768 to 32767
        short b = -32768;
        System.out.println("b:"+b);

//Int Range is  -2,147,483,648 to 2,147,483,647
        int c = 15000;
        System.out.println("c:"+c);

//long Range is -9,223,372,036,854,778,808 to 9,223,372,036,854,775,807
        long d = 100000;
        System.out.println("d:"+d);

//Float Family
//Float rang is 3.4E-38 TO 3.4E+38
        float e = -1.16666666666666666666666666666666666666666666f;
        System.out.println("e:"+e);

//Double rang is approximately 1.8 * (10)308
        double f = 15000.6666666666666666666666666666666666666666666666666666666666;
        System.out.println("f:"+f);

//Character Family
//Character rang is unicode value (Single range value)
        char g = '1';
        System.out.println("g:"+g);

//Boolean Family
//Boolean don't have rang, it's a fix value True or False
        boolean h = true;
        boolean i=false;
        System.out.println("h:"+h);
        System.out.println("i:"+i);


// String Family
//String rang is 0 to 2,147,483,647
        String j="Software Testing";
        System.out.println("j:"+j);



// Concatenation
    String k ="Software";
    String l = "Testing";
        System.out.println(k+" " +l);


    }



}

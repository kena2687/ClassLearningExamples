package C.Operators;

public class Logical {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println(a<b && a>b); //f
        System.out.println(a<b || a>b); //t
        System.out.println (!(a<b && a>b)); //t

    }
}

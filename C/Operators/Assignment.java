package C.Operators;

public class Assignment {
    public static void main(String[] args) {
        int a=10;
        int b = 20;

        System.out.println(a=b); // Ans: a= 20,  20

        System.out.println(a+=b); // a = b+a Ans: a= 40,
        System.out.println(a-=b); // a= b-a Ans: a= 20
        System.out.println(a*=b); // a= b*a Ans: a=400
        System.out.println(a/=b); // a= b/a Ans: a=20
        System.out.println(a%=b); // a= b/a Ans: a=0
        System.out.println(a^=b); // a=b^a Ans:

    }

}

package Q.Exception;

public class ExcepHand {
    public static void main(String[] args) {
//      uncaught Exception/unchecked
//        int i=10/0;
//        System.out.println(i);
//      Caught Exception/checked
//        Thread.sleep(1000);


//        int ar[] = new int[5];
          int ar[] = {1,2,3,4,5};
          for (int i=0; i<=ar.length;i++){
              System.out.println(ar[i]);
          }
        System.out.println("Exception Handled");
    }
}

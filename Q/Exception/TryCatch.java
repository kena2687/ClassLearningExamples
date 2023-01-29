package Q.Exception;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int ar[] = {1, 2, 3, 4, 5};
            for (int i = 0; i <=ar.length; i++) {
                System.out.println(ar[i]);
            }
        }catch (Exception e){
            System.out.println("Array size is not right");
        }

        System.out.println("Exception Handled");
    }
}

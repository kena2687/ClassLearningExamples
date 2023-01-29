package Q.Exception;

import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int n[] = {100, 200, 300};
            System.out.println(n[300]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is out of range ");
        }catch (Exception e) {
            System.out.println("Any other exception ");
        }finally{
            System.out.println("100% working");
        }
    }
}

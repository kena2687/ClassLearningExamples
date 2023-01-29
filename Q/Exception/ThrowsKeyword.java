package Q.Exception;

public class ThrowsKeyword {

    public void sum() {
        try{
            div();
        }catch (Exception e){

        }

    }
    public void div() throws ArithmeticException{
        int i=10/0; //Exception Line
    }

    public static void main(String[] args) throws ArithmeticException{
        ThrowsKeyword obj =new ThrowsKeyword();
        obj.sum();
        System.out.println("Exception Handled");

    }
}

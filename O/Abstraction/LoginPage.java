package O.Abstraction;

public class LoginPage extends Pages {

    @Override
    public void header() {
        System.out.println("Login page Header");
    }

    @Override
    public void title() {
        System.out.println("Login page Title");
    }

    @Override
    public void logo() {
        System.out.println("Company Logo");
    }

    public void login(String Uname, String Pwd){
        System.out.println(Uname+ " " +Pwd );
    }
}

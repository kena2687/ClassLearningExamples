package O.Abstraction;

public class TestPage {
    public static void main(String[] args) {
        LoginPage L = new LoginPage();
        L.logo();
        L.header();
        L.title();
        L.login("Test","Software");
    }
}

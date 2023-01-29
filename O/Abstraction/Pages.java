package O.Abstraction;

/*
It has abstract keyword
- Abstract means  method  with no body.
- Abstract method is final static method.
- It will have abstract and non abstract method
- Purpose : Page will define rules for all it's child class.

 */
public abstract class Pages {

    public abstract void header();
    public abstract void title();
    public abstract void logo();
    public void logout(){
        System.out.println("Logout the user");
    }

}

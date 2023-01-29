package O.Abstraction;

/*
- We can not have a method Body - Only method declarations - 100% Abstractions
- It will define all methods in interface with no implementations
- No  Static methods in interface because we cannot override static.
- We can not create object of interface.
- Class to Class : extends
- Interface to Class : Implements
- Interface to Interface :  extends
 */
public class BobBank implements UKBank,USABank,AUSBank{
    @Override
    public void freeDebitCard() {
        System.out.println("Free Debit card");
    }

    @Override
    public void savingAccount() {
        System.out.println("Free Saving account");
    }

    @Override
    public void freeCashWith() {
        System.out.println("Free cash Withdrawals");
    }

    @Override
    public void freeChequeBook() {
        System.out.println("Free Cheque book");
    }
}

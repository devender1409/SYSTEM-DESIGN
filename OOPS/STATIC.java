package OOPS;

public class STATIC{
    static class BankAccount{
        int anum;
        int money;
        static int roi;

        public void announce(){
            System.out.println(anum + " : " + money + " with roi :" + roi );
        }

        static void decrease(){
            roi--;
            // announce();//not allowed

            BankAccount b = new BankAccount();
            b.announce();//this is allowed
        }
    }
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.anum=434;
        a.money = 27000;
        a.roi = 4; //(bad practice) : static member should be modified using class not object
        a.decrease();//(bad practice) : 
        a.announce();

        BankAccount b = new BankAccount();
        b.anum = 409;
        b.money = 44000;
        b.roi = 5;
        b.announce();
        a.announce();

    }

}
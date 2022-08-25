

public class Q2 {  
    
    class CellPhone{
        String name = "Nokia3310";
        public void call(){
            System.out.println("phone is ringing");
        }
    
        public void msg(){
            System.out.println("u gotta msg");
        }
    }
    public static void main(String[] args) {
        Q2 x = new Q2();
        CellPhone realme = x.new CellPhone();
        realme.call();
        realme.msg();
    }
}

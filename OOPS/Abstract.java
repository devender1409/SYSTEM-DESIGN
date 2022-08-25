
abstract class Base1{
    abstract public int area();
    
}
class derived1 extends Base1{
    public int area(){
        return 0;
    }
    public int perim(){
        return -1;
    }
}
public class Abstract {
    public static void main(String[] args) {
        Base1 obj = new derived1();
        System.out.println(obj.area());
    }
    
}


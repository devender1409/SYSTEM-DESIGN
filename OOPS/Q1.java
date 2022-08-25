class Square{
    private int a=1;
    Square(int a){
        this.a=a;
    }

    public int area(){
        return a*a;
    }

    public int perim(){
        return 4*a;
    }

}
public class Q1 {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.area());
        System.out.println(s.perim());        
    }
    
}

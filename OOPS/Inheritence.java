package OOPS;

class base{
    base(){
        System.out.println("Base Constructor");
    }
    base(int x){
        this.x = x;
        System.out.println("overloaded base constructor");
    }
    public int x;
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }

    public void meth(){
        System.out.println("base class method");
    }
}

class derived extends base{
    int y;
    derived(){
        System.out.println("I'm  derived's class constructor");

    }
    
    derived(int y){
        // super(5);
        System.out.println("I'm overloaded derived's class constructor");
    }
    public void meth(){
        System.out.println("derived class method");
    }

    /* (non-Javadoc)
     * @see base#setX(int)
     */
    @Override
    public void setX(int x){
        super.setX(x);
        System.out.println("setx method");
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }

}
public class Inheritence {
    public static void main(String[] args) {
        base basekaobject = new derived(7);
        basekaobject.setX(25);
        System.out.println(basekaobject.getX());
        basekaobject.meth();
    }
    
}

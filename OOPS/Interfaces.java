
interface Bicycle{
    final int spd = 40;//speed - by default final

    void blowHorn();
    int speed();
}

class Ranger implements Bicycle{
    public void blowHorn(){
        System.out.println("po po");
    }

    // @Override
    // public void blowHorn(){
    //     System.out.println("cannot override methods which are present in interfaces as well as class implementing that interface");
    // }

    public int speed(){
        System.out.println("Cycle is running at speed of 40kmph");
        return 40;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Bicycle cycle = new Ranger();
        cycle.blowHorn();
        cycle.speed();
        // cycle.spd = 35;//cannot assign value to a variable present in interfaces as that variable is supposed to be private
        
    }
    
}

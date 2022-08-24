package OOPS;

public class FINAL {
    public static void main(String[] args) {
        
    }

    static class P{
        final int maxScore = 40;//data member final

        final void fun(){
            final int age = 30;//data variable final
            // maxScore = maxScore+5;//not allowed due to final keyword
            // age++;// --> not allowed due to final keyword on age variable
            System.out.println("P fun");
        }
    }
    static class C{
       
        //here the above already defined fun method can't be override due to final keyword
        // void fun(){
        //     System.out.println("c fun");
        // }
    }
    
}

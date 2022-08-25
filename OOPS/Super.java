
public class Super {
    public static void main(String[] args) {
        
    }
    public static class parentClass{
        int i;
        int j;

        parentClass(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
    public static class derivedClass extends parentClass{
        int k;
        derivedClass(int i,int j,int k){
            super(i,j);
            this.k = k;
        }
    }
}

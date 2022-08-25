

interface I1{
    void meth1();
    void meth2();
}

interface I2{
    void meth2();
    void meth3();
}

class classImplementingInterfaces implements I1,I2{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    @Override
    public void meth2(){
        System.out.println("meth2");
    }

    @Override
    public void meth3(){
        System.out.println("meth3");
    }
}
public class InheritenceInInterfaces {
    public static void main(String[] args) {
        classImplementingInterfaces cii = new classImplementingInterfaces();
        cii.meth2();
    }
    
}

package OOPS;

class Employee{
    int id;
    String name;

    public void details(){
        System.out.println(id +":"+name);
    }
}
public class UnderstandingClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 434;
        e1.name="Devender";
        e1.details();
    }
}

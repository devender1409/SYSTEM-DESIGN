package singletonDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.getSingleInstance();
		Singleton obj2 = Singleton.getSingleInstance();
		System.out.println(obj==obj2);

	}

}

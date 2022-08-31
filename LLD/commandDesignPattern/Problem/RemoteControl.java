package commandDesignPattern.Problem;

public class RemoteControl {
	Light light = new Light();
	
	public void btn1click() {
		light.on();
	}
	
	void btn2click() {
		light.off();
	}
	
	void btn3click() {
		System.out.println("No functionality");
	}
	
	void btn4click() {
		System.out.println("No functionality");
	}
}

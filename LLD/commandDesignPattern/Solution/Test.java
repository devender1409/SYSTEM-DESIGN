package commandDesignPattern.Solution;

public class Test {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		rc.b1Command = new LightOnCommand(light);
		rc.b2Command = new LightOffCommand(light);
		rc.b3Command = new StereoOnCommand(stereo);
		rc.b4Command = new StereoOffCommand(stereo);
		
		// Test
		rc.btn1Click();
		rc.btn2Click();
		rc.btn3Click();
		rc.btn4Click();
	}
}

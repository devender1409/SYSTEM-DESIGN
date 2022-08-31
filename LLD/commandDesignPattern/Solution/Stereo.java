package commandDesignPattern.Solution;

public class Stereo {
	private int volume = 5;
	void on() {
		System.out.println("Turn on the Stereo");
	}
	
	void off() {
		System.out.println("Turn off the stereo");
	}
	
	void incVolume(int vol) {
		this.volume += vol;
		System.out.println("volume set to " + this.volume);
	}
	
	void decVolume(int vol) {
		this.volume -= vol;
		System.out.println("Volume set to "+ this.volume);
	}
	
}

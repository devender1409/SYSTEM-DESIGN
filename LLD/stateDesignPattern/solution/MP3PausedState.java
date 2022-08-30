package stateDesignPattern.solution;


public class MP3PausedState extends AudioPlayerState {
	@Override
	public void pressPlay(AudioPlayer pl) {
		System.out.println("Playing MP3");
		pl.state = new MP3PlayState();
	}

	@Override
	public void pressChangeSource(AudioPlayer pl) {
		System.out.println("Changing Source to Radio");
		pl.state = new RadioState();
	}
}

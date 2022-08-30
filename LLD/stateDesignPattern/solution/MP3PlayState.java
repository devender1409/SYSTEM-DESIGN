package stateDesignPattern.solution;

public class MP3PlayState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("MP3 Paused");
		pl.state = new MP3PausedState();
		
	}

	@Override
	public void pressChangeSource(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Changing source to Radio");
		pl.state = new RadioState();
	}

}

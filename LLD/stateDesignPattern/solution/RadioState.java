package stateDesignPattern.solution;

public class RadioState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Changing Stations");
	}

	@Override
	public void pressChangeSource(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Changing source to MP3");
		pl.state = new MP3PausedState();
	}

}

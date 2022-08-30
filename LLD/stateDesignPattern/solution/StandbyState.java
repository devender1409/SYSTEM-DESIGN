package stateDesignPattern.solution;

public class StandbyState extends AudioPlayerState {

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Invalid Operation");
	}

	@Override
	public void pressChangeSource(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Changing source to radio");
		pl.state = new RadioState();
	}

}

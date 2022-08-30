package stateDesignPattern.solution;


public class AudioPlayer {
	AudioPlayerState state;
	
	public AudioPlayer() {
		this.state = new StandbyState();
	}
	
	public void pressPlay() {
		this.state.pressPlay(this);
	}
	
	public void pressChangeSource() {
		this.state.pressChangeSource(this);
	}
}
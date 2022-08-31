package commandDesignPattern.Solution;

public class StereoDecVolCommand extends Command {

Stereo stereo;
	

	public StereoDecVolCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.decVolume(3);;
		
	}

	@Override
	public void undo() {
		this.stereo.incVolume(3);
	}

}

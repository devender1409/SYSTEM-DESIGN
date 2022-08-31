package commandDesignPattern.Solution;

public class StereoIncVolCommand extends Command{
	Stereo stereo;
	

	public StereoIncVolCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.incVolume(3);;
		
	}

	@Override
	public void undo() {
		this.stereo.decVolume(3);
	}



}

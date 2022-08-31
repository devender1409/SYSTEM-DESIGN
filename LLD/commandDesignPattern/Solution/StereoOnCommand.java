package commandDesignPattern.Solution;

public class StereoOnCommand extends Command {
	Stereo stereo;
	

	public StereoOnCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.on();
		
	}

	@Override
	public void undo() {
		this.stereo.off();
	}

}

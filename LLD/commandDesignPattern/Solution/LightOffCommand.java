package commandDesignPattern.Solution;

public class LightOffCommand extends Command{
	Light light;
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.light.on();
	}
}

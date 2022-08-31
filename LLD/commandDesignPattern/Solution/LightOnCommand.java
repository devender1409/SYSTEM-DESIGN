package commandDesignPattern.Solution;

public class LightOnCommand extends Command{
	Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.light.off();
	}

}

package decoratorDesignPattern;

public abstract class ShapeDecorator implements Shape {
	private Shape shape;
	
	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}

}

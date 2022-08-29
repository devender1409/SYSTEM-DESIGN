package decoratorDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		
		BorderShapeDecorator bsd = new BorderShapeDecorator(c);
		ColorShapeDecorator csd = new ColorShapeDecorator(bsd);
		
		csd.draw();
	}

}

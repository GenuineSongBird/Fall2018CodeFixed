package Shopping;

public class Triangle extends ShapeBasics implements TriangleInterface{
	private int base;
	public Triangle() {
		super();
		this.base = 0;
		
	}
	public Triangle(int xOffset, int xBase) {
		super(xOffset);
		this.setBase(xBase);
	}
	public int getBase() {
		return this.base;
	}
	public void setBase(int xBase) {
		if(xBase > 0 && xBase%2 == 1) {
			this.base = xBase;
		}
	}
	public void drawHere() {
		drawTop();
		drawBase();
	}
	
	private void drawTop() {
		int center = this.getBase()/2;
		int start = this.getOffset() + center;
		int insideWidth = 1;
		
		this.skipSpaces(start);
		System.out.println("*");
		
		int count = center - 1;
		for(int i = 0; i < count; i++ ) {
			start--; //start is equal to start minus one
			this.skipSpaces(start);
			System.out.print("*");
			this.skipSpaces(insideWidth);
			System.out.println("*");
			insideWidth +=2;
		}
	}
	private void drawBase() {
		this.skipSpaces(this.getOffset());
		for(int i = 0; i < this.base; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	private void skipSpaces(int lineNumber) {
		for(int i = 0; i < lineNumber; i++ ) {
			System.out.print(" ");
		}
		//System.out.println();
	}
	
	
	
}

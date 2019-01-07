package Shopping;

public class Rectangle extends ShapeBasics implements RectangleInterface {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.width = 0;
		this.height = 0;
	}
	public Rectangle(int xOffset, int xWidth, int xHeight) {
		super(xOffset);
		this.set(xWidth,  xHeight);
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height; }
	public void set(int xWidth, int xHeight) {
		if(xWidth > 0 && xHeight > 0) {
			this.width = xWidth;
			this.height = xHeight;
		}
	}
	public void drawHere() {
		drawHorizontalLine();
		drawSides();
		drawHorizontalLine();
	}
	private void drawHorizontalLine() {
		this.skipSpaces(this.getOffset());
		for(int i = 0; i < this.width; i++) {
			System.out.print("*");
			//System.out.println("");
		}
		System.out.println();
	}
	private void drawSides() {
		int w = this.width; //making a copy of the width
		
		for(int i = 0; i < this.height - 2; i++) {
			this.skipSpaces(this.getOffset());
			System.out.print("*");
			this.skipSpaces(w - 2);
			System.out.print("*\n");
			
		}
	}
	private void skipSpaces(int number) {
		for(int i = 0; i < number; i++) {
			System.out.print("  ");
		}
	}
}

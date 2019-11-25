
public class Rectangle extends Figure implements Moveable {
	protected float height;
	protected float width;

	public Rectangle(float x, float y, float height, float width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public float getArea() {
		float area = height * width;
		return area;
	}

	@Override
	public float getPerimeter() {
		float perimeter = 2 * (height + width);
		return perimeter;

	}

	@Override
	public void move(float dx, float dy) {
		x += dx;
		y += dy;

	}

	@Override
	public void resize(float koeff) {
		x *= koeff;
		y *= koeff;

	}
	@Override
	public String toString() {
		String a = new String();
		a = "Rectangle";
		String str = new String();
		str = "\n" + "Center:" + " (" + String.valueOf(x + width/2) + ", " + String.valueOf(y + height/2) +")" + "\n";
		String str1 = new String();
		str1 = "Height: " + String.valueOf(height) + "\n";
		String str2 = new String();
		str2 = "Width: " + String.valueOf(width);
		return new StringBuilder().append(a).append(str).append(str1).append(str2).toString();
	}

}

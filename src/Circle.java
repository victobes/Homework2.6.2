
public class Circle extends Figure implements Moveable {
	protected float radius;

	public Circle(float x, float y, float radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getArea() {
		float area = (float) (Math.PI * radius * radius);
		return area;
	}

	@Override
	public float getPerimeter() {
		float perimeter = (float) (2 * Math.PI * radius);
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
		a = "Circle";
		String str = new String();
		str = "\n" + "Center:" + " (" + String.valueOf(x) + ", " + String.valueOf(y) +")" + "\n";
		String str1 = new String();
		str1 = "Radius: " + String.valueOf(radius);
		return new StringBuilder().append(a).append(str).append(str1).toString();
	}

}

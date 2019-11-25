
abstract class Figure {
	protected float x;
	protected float y;

	public abstract float getArea();

	public abstract float getPerimeter();

	public Figure(float x, float y) {
		this.x = x;
		this.y = y;

	}
}

public class Circle extends GraphicObject {
	void resize() {
		System.out.println("Circle Resize");
	}

	void drawShape() {
		System.out.println("Circle Shape");
	}

	void posisition() {
		System.out.println(this.x + this.y);
	}
}
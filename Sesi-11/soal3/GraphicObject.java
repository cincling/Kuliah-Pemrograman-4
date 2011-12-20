abstract class GraphicObject {
	int x,y;

	void moveTo(int newValueX, int newValueY) {
		x = newValueX;
		y = newValueY;
	}

	abstract void drawShape();

	abstract void resize();
}
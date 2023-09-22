package desing.pattern.creational;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private Map<String, Shape> makersMap = new HashMap<>();

	public ShapeFactory() {

		makersMap.put("CIRCLE", new Circle());
		makersMap.put("RECTANGLE", new Rectangle());
		makersMap.put("SQUARE", new Square());
		makersMap.put(null, null);

	}

	public Shape getShape(String shapeType) {
		return makersMap.get(shapeType);
	}

}

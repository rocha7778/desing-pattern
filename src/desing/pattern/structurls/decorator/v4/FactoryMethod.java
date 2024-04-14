package desing.pattern.structurls.decorator.v4;

import java.util.HashMap;
import java.util.Map;

public class FactoryMethod {
	
	private Map<Integer, Caffe> makersMap = new HashMap<>();
	public FactoryMethod(Caffe sc) {
		makersMap.put(1, new MilkCoffe(sc));
		makersMap.put(2, new CocoaCoffe(sc));
		makersMap.put(3, new ChocolateCoffe(sc));
		makersMap.put(4, new EspumaCoffe(sc));
	}

	public Caffe getChair(int shapeType) {
		return makersMap.get(shapeType);
	}

}


